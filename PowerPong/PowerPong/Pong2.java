package PowerPong.PowerPong;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pong2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pong2 extends Actor
{
    /**
     * Act - do whatever the Pong2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    final public int timerBoostTotal = 400;
    boolean statusBoost = false;
    int timerBoost= 400;
    public void act() 
    {
        possoAndarParaCima();
        possoAndarParaBaixo();
        ligarBoost();

    }

    public Pong2(){
        GreenfootImage img = new GreenfootImage(15, 78);
        img.setColor(Color.WHITE);
        img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
        setImage(img);        
    }

    public void possoAndarParaCima(){
        Actor barralateral = getOneIntersectingObject(BarraLateral.class);
        if(barralateral==null){
            andarParaCima();
        }
    }

    public void possoAndarParaBaixo(){
        Actor barralateral2 = getOneIntersectingObject(BarraLateral2.class);
        if(barralateral2==null){
            andarParaBaixo();
        }
    }

    public void andarParaCima(){
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - velocidade());
            setRotation(0);
        }
    }   

    public void andarParaBaixo(){
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + velocidade());
            setRotation(0);
        }
    }

    public void ligarBoost(){
        if(Greenfoot.isKeyDown("0")){
            statusBoost = true;

        }
        controleBoost();
    }

    public void addTimeBoost(){
        setTimerBoost(400);
    }

    public void controleBoost(){
        if(getStatusBoost()){
            //1 segundo dura em media 60 ciclos;
            if(getTimerBoost() >= 0){
                setTimerBoost(getTimerBoost() - 1);
            }else{
                statusBoost = false;
            }
        }  
    }

    public int velocidade(){
        if(getStatusBoost()){
            return 12;    
        }else{
            return 3;    
        }
    }
    //Getters e Setters
    public void setTimerBoost(int valor){
        this.timerBoost = valor;
    }

    public void setStatusBoost(boolean valor){
        this.statusBoost = valor;
    }

    public int getTimerBoost(){
        return this.timerBoost;
    }

    public boolean getStatusBoost(){
        return this.statusBoost;
    } 

}   