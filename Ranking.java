import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ranking extends World
{
    GreenfootSound sound = new GreenfootSound("SomRanking.wav");
    /**
     * Constructor for objects of class Ranking.
     */
    public Ranking()
    {
        super(700, 390, 1);
        prepare();
    }

    public void act(){
        sound.play();
    }
    
    /*public String NomeJogador(){
        
    }*/

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        VoltarInicioRanking voltarinicioranking = new VoltarInicioRanking();
        addObject(voltarinicioranking,355,331);
        ImagemRanking imagemranking = new ImagemRanking();
        addObject(imagemranking,366,47);
        JogadorPontuacaoRanking jogadorpontuacaoranking = new JogadorPontuacaoRanking();
        addObject(jogadorpontuacaoranking,366,117);
        jogadorpontuacaoranking.setLocation(354,108);
    }
    
    public void desligaSom(){
       sound.stop();
    }
}
