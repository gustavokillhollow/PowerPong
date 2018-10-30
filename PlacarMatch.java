import greenfoot.*;  

public class PlacarMatch extends Actor

{
   public int numeroPartidas = 0;
   public PlacarMatch(){
        atualizaImagem(numeroPartidas);
   }
    
    public void addPartidas(int valorPartida){
       numeroPartidas += valorPartida; 
   }
  
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