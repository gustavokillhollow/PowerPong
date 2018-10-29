import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Placar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacarPong1 extends Actor
{
    private int pontuacaoUm = 0;

    public PlacarPong1(){
        atualizaImagem(pontuacaoUm);
    }

    public void addPontos(int valor){
        pontuacaoUm += valor; 
    }

    /**
     * Act - do whatever the PlacarPong1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        atualizaImagem(pontuacaoUm);
    }    

    private void atualizaImagem(int valor){
        GreenfootImage Pong1 = new GreenfootImage(converteNumero(valor), 24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(Pong1);
    }

    private String converteNumero(int valor){
        return String.format("%02d",valor);
    }
}
