import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Nome extends Actor
{
    public String nome1;
    public String nome2;
    public int placar1;
    public int placar2;
    /**
     * Act - do whatever the Nome wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }

    public Nome(){
        this.nome1 = InputNomeJogadores.Pong;
        this.nome2 = InputNomeJogadores.Pong2;
        this.placar1 = Jogo.pontuacaoUm.getValor1();
        this.placar2 = Jogo.pontuacaoDois.getValor2();
    }    

    public String getNome1(){
        return this.nome1;
    }

    public String getNome2(){
        return this.nome2;
    }
    
    public int getPlacar1(){
        return this.placar1;
    }
    
     public int getPlacar2(){
        return this.placar2;
    }
}
