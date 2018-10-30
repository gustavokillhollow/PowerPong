import greenfoot.*;  
public class PlacarPong2 extends Actor
{
    private int pontuacaoDois = 0; 
    GameOver World =(GameOver) getWorld();
    public PlacarPong2(){
        atualizaImagem(pontuacaoDois);
    }

    public void addPontos(int valor){
        pontuacaoDois +=valor; 
            if(pontuacaoDois >= 5){
            saiSom();
            Greenfoot.setWorld( new  GameOver());
       }
    }
    
     public void saiSom()
    {
        Jogo World =(Jogo) getWorld();
        World.desligaSom();
        }

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
