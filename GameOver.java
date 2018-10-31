import java.util.*;
import greenfoot.*;

public class GameOver extends World
{
    private Integer ciclo = 0;
    private JogadorUmVence jogadorUmVence;
    private boolean iniciarSom = true;
    GreenfootSound sound = new GreenfootSound("SomGameOver.wav");
    public GameOver()
    {
        super(700, 390, 1);
        prepare();
    }

    public void desligaSom(){
        sound.stop();
    }

    public void IniciaSom(){
        if(iniciarSom == true){
            sound.play();
        }
    }

    private void prepare()
    {
        ImagemGameOver imagemgameover = new ImagemGameOver();
        addObject(imagemgameover,307,103);
        imagemgameover.setLocation(349,39);

        VoltarInicio voltarinicio = new VoltarInicio();
        addObject(voltarinicio,230,344);
        voltarinicio.setLocation(158,322);

        Restarte restarte = new Restarte();
        addObject(restarte,441,351);
        restarte.setLocation(351,320);

        IniciaRanking iniciaRanking = new IniciaRanking();
        addObject(iniciaRanking,342,321);

        restarte.setLocation(538,318);
    }

    public void act(){
        contaCiclo();
        IniciaSom();
    }

    public void addImgVencUM(){                
        addObject(new JogadorUmVence(), 351, 190);
    }

    /*public void addImgPongUm(){
    Jogo World =(Jogo) getWorld();
    World.acrescentaPontosUm(int valor);
    }*/

    public void contaCiclo()
    {
        ciclo=ciclo+1;
        if (ciclo > 1000) {
            ciclo = 0;
        }
    }

    public int getCiclo()
    {
        return ciclo;
    }
}
