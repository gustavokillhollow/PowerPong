import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Nome extends Actor
{
    public String nome1;
    public String nome2;
    /**
     * Act - do whatever the Nome wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

    }

    public Nome(){
        this.nome1 = InputNomeJogadores.Pong;
        this.nome2 = InputNomeJogadores.Pong2;
    }    

    public String getNome1(){
        return this.nome1;
    }

    public String getNome2(){
        return this.nome2;
    }
}
