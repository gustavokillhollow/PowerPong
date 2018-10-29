import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlacarPong2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacarPong2 extends Actor
{
    private int pontuacaoDois = 0; 

    public PlacarPong2(){
        atualizaImagem(pontuacaoDois);
    }

    public void addPontos(int valor){
        pontuacaoDois +=valor; 
    }

    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        atualizaImagem(pontuacaoDois);
    }    

    private void atualizaImagem(int valor){
        GreenfootImage Pong1 = new GreenfootImage(converteNumero(valor), 24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(Pong1);
    }

   private String converteNumero(int valor){
       return String.format("%02d",valor);
    }
}
