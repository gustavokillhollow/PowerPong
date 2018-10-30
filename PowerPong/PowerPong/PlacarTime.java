package PowerPong.PowerPong;

import greenfoot.*;

/**
 * Write a description of class TimeMinuto here. @author (your name) @version (a version number or a date)
 */
public class PlacarTime extends Actor
{
    /* WARNING: This file is auto-generated and any changes to it will be overwritten*/
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    public  int valor = 300;

    /**
     * 
     */
    public PlacarTime()
    {
        atualizaImagem(valor);        
    }    

    /**
     * Act - do whatever the PlacarTime wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Jogo mundo = (Jogo) getWorld();
        if(mundo.cicloAtual()>193){
            atualizaImagem(valor);
            atualizaImagem();
            resetImagem();
        }        
    }

    /**
     * 
     */
    private void atualizaImagem(int valor)
    {
        GreenfootImage Time =  new  GreenfootImage(converteNumero(valor), 24, Color.WHITE,  new  Color(0, 0, 0, 0), Color.BLACK);
        setImage(Time);
    }

    /**
     * 
     */
    public void atualizaImagem()
    {
        float resultado = 300;
        resultado = getWorldOfType(Jogo.class).getCiclo() % 8;
        if ((resultado > 6)&&(valor !=0)){
            valor = valor - 1;
        }

    }
   
    public void resetImagem(){
        if(valor == 0){
            valor = 300;
        }
    }

    /**
     * 
     */
    private String converteNumero(int valor)
    {
        return String.format("%03d", valor);
    }

    public int getValor() {
        return valor;
    }
}
