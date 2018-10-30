package PowerPong;

import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Bola here.
 * @author (your name) @version (a version number or a date)
 */
public class Bola extends Actor
{
    public int res = 0;//variavel satanica pra fazer o codigo dar certo sem pacto
    public int speed = 3;
    public int hDirection = 1;//Direita:1 Esquerda:-1
    public int vDirection = 1;//Cima:-1 Baixo=1    
    public boolean controle = true;
    //public boolean controle2 = true;

    public void act()
    {                               
        vaiBola();
        changeDirection();
        chutarBola();
        movimentacomPong();
        movimentacomPong2();
        somaPontoUm();
        somaPontoDois();
        addRes();
        speedUp();
        resetRes();
        pegaModificadorGanharPowerBoost();
        pegaModificadorTamanhoDoPad();
    }    

    public void pegaModificadorGanharPowerBoost(){
        int meioDoMundo = getWorldOfType(Jogo.class).getWidth() / 2; 
        Actor obj = getOneIntersectingObject(ModificadorGanharPowerBoost.class);
        if (obj != null){
            Greenfoot.playSound("SomGanharPowerBoost.wav");
            getWorldOfType(Jogo.class).removeObject(obj);
            if(meioDoMundo > getX()){
                getWorldOfType(Jogo.class).pong.addTimeBoost();
            }
            else if(meioDoMundo < getX()){
                getWorldOfType(Jogo.class).pong2.addTimeBoost(); 
            }
        }
    }

    public void pegaModificadorTamanhoDoPad(){
        int meioDoMundo = getWorldOfType(Jogo.class).getWidth() / 2; 
        Actor obj = getOneIntersectingObject(ModificadorDeTamanhoPad.class);
        if (obj != null){
            Greenfoot.playSound("SomGanharPowerBoost.wav");
            getWorldOfType(Jogo.class).removeObject(obj);
            if(meioDoMundo > getX()){
                getWorldOfType(Jogo.class).pong.ModificarTamanhoPad();
            }
            else if(meioDoMundo < getX()){
                getWorldOfType(Jogo.class).pong2.ModificarTamanhoPad(); 
            }
        }
    }

    public void vaiBola(){
        Jogo mundo = (Jogo) getWorld();
        if(mundo.cicloAtual()>193){
            movimentoBola();
        }
    }


    public void movimentoBola(){
        if(controle){
            int newX = getX() + hDirection * speed;
            int newY = getY() + vDirection * speed;
            setLocation(newX,newY);
        }
    }

    public void changeDirection(){
        Pong pong = (Pong)getOneIntersectingObject(Pong.class);
        Pong2 pong2 = (Pong2)getOneIntersectingObject(Pong2.class);         
        if(getX()>=getWorld().getWidth() - 5){
            hDirection*=-1;
        }
        if(getY()>=getWorld().getHeight() - 5){
            vDirection*=-1;
        }
        if(getX() <= 5){
            hDirection*=-1;
        }
        if(getY() <= 5){
            vDirection*=-1;
        }
        if(getY() <= 30 && isTouching(BarraLateral.class)){
            vDirection*=-1;
        }
        if(getY() <= 367 && isTouching(BarraLateral2.class)){
            vDirection*=-1;
        }
        if((getX() <= 60) && pong != null){
            Greenfoot.playSound("ToquePong.wav");
            hDirection*= -1;
        }
        if((getY() <= 650) && pong2 != null){
            Greenfoot.playSound("ToquePong.wav");
            hDirection*= - 1;
        }
    }

    public void somaPontoUm(){
        if(getX()>= 695){
            Greenfoot.playSound("FazGol.wav");
            Jogo World =(Jogo) getWorld();
            World.acrescentaPontosUm(1);
            World.acrescentaPontosPartida(1);
            this.controle = false;
            resetBolaPontoUm();
        }                    
    }

    public void chutarBola(){        
        if(Greenfoot.isKeyDown("space")){
            this.controle = true;
        }
    }

    public void resetBolaPontoUm(){
        Pong pong = (Pong)getOneIntersectingObject(Pong.class);
        if(getX()>=695){
            setLocation(67, 198);
        }
    }

    public void resetBolaPontoDois(){
        if(getX()<=5){
            setLocation(644, 198);
        }
    }                    

    public void somaPontoDois(){
        if(getX()<=5){
            Greenfoot.playSound("FazGol.wav");
            Jogo World = (Jogo) getWorld();
            World.acrescentaPontosDois(1);
            World.acrescentaPontosPartida(1);
            this.controle = false;
            resetBolaPontoDois();
        }
    }

    public void addRes(){        
        Jogo mundo = getWorldOfType(Jogo.class);           
        if (mundo.oTempoEstaZerado()){
            Greenfoot.playSound("SomSpeedUp.wav");
            res = res+1;
        }                 
    }

    public void speedUp(){
        if(res == 8){
            speed = speed + 2;
        }
    }

    public void resetRes(){
        if(res == 8){
            res = 0;
        }
    }

    public Bola(){
        GreenfootImage img = new GreenfootImage(18, 17);
        img.setColor(Color.WHITE);
        img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
        setImage(img);
    } 

    public void movimentacomPong(){
        if(controle == false){ 
            if(getY()<=321){    
                if(Greenfoot.isKeyDown("S")){
                    this.setLocation(getX(), getY() +3);
                }
            }
            if(getY()>=63){ 
                if(Greenfoot.isKeyDown("W")){
                    this.setLocation(getX(), getY() -3);
                }
            }
        }
    }
    public void movimentacomPong2(){
        if(controle == false){ 
            if(getY()<=321){    
                if(Greenfoot.isKeyDown("down")){
                    this.setLocation(getX(), getY() +3);
                }
            }
            if(getY()>=63){ 
                if(Greenfoot.isKeyDown("up")){
                    this.setLocation(getX(), getY() -3);
                }
            }
        }
    }
}

