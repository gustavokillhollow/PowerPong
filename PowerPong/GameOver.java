package PowerPong;

import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOver extends World
{
    private Integer ciclo = 0;
    private JogadorUmVence jogadorUmVence;
    private boolean iniciarSom = true;
    GreenfootSound sound = new GreenfootSound("SomGameOver.wav");
    /**
     * Constructor for objects of class GameOver.
     */
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
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        ImagemGameOver imagemgameover = new ImagemGameOver();
        addObject(imagemgameover,307,103);
        imagemgameover.setLocation(349,39);
        VoltarInicio voltarinicio = new VoltarInicio();
        addObject(voltarinicio,230,344);
        Restarte restarte = new Restarte();
        addObject(restarte,441,351);
        voltarinicio.setLocation(259,339);
        restarte.setLocation(440,337);
        restarte.setLocation(436,337);
        restarte.setLocation(443,337);
        voltarinicio.setLocation(256,339);
        imagemgameover.setLocation(354,59);
    }
    
    public void act(){
        contaCiclo();
        IniciaSom();
    }
    
    public void addImgVencUM(){                
        addObject(new JogadorUmVence(), 351, 190);
    }
    
     /**
     * 
     */
    public void contaCiclo()
    {
        ciclo=ciclo+1;
        if (ciclo > 1000) {
            ciclo = 0;
        }
    }

    /**
     * 
     */
    public int getCiclo()
    {
        return ciclo;
    }
}
