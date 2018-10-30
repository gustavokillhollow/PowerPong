import java.util.*;
import greenfoot.*;
import java.lang.String.*;
/**
 * 
 */
public class InputNomeJogadores extends World
{   
    public String Pong;
    public String Pong2;
    GreenfootSound sound = new GreenfootSound("NomeJogadores.wav");
    /**
     * Constructor for objects of class InputNomeJogadores.
     */
    public InputNomeJogadores()
    {
        super(700, 390, 1);
        prepare();
    }
    
    /*public void Start(){
    Inicio world = (Inicio) getWorld();
    Greenfoot.setWorld(new Inicio());
    }*/

    public void prepare(){
        IniciarJogo iniciarjogo = new IniciarJogo();
        addObject(iniciarjogo,299,275);
    }
    
    public void act(){
       IniciaJogo();
       ask();
    }
 
    public void ask(){
        String Pong = Greenfoot.ask("Nome do Jogador 1: ");
        String Pong2 = Greenfoot.ask( "Nome do Jogador 2: ");
    }
    
       private void IniciaJogo(){
        sound.play();
    }
    
    public void desligaSom(){
       sound.stop();
    }
}
