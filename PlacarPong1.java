import greenfoot.*;  
public class PlacarPong1 extends Actor
{
    private int pontuacaoUm = 0;
    GameOver World =(GameOver) getWorld();
    public PlacarPong1(){
        atualizaImagem(pontuacaoUm);
    }

    public void addPontos(int valor){
        pontuacaoUm += valor; 
         if(pontuacaoUm >= 5){
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
