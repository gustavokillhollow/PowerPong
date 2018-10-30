package PowerPong.PowerPong;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlacarMatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacarMatch extends Actor

{
   public int numeroPartidas = 0;
    
   public PlacarMatch(){
        atualizaImagem(numeroPartidas);
   }
    
    public void addPartidas(int valorPartida){
       numeroPartidas += valorPartida; 
       if(numeroPartidas >= 1000){
            Greenfoot.setWorld( new  GameOver());
       }
   }
  
   /**
     * Act - do whatever the PlacarPong1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
          atualizaImagem(numeroPartidas);
   }    
    
   private void atualizaImagem(int valorPartida){
        GreenfootImage Partida = new GreenfootImage(converteNumero(valorPartida), 24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(Partida);
   }
   
   private String converteNumero(int valorPartida){
       return String.format("%02d",valorPartida);
    }
}