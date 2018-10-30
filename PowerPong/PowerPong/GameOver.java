package PowerPong.PowerPong;

import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOver extends World
{
    private Integer ciclo = 0;
    /**
     * Constructor for objects of class GameOver.
     */
    public GameOver()
    {
        super(700, 390, 1);

        prepare();
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        ImagemGameOver imagemgameover = new ImagemGameOver();
        addObject(imagemgameover,351,122);
        imagemgameover.setLocation(347,116);
        Restarte restarte = new Restarte();
        addObject(restarte,339,276);
        restarte.setLocation(345,244);
        imagemgameover.setLocation(340,116);
        VoltarInicio voltarinicio = new VoltarInicio();
        addObject(voltarinicio,555,276);
        voltarinicio.setLocation(231,255);
        restarte.setLocation(415,253);
        restarte.setLocation(426,253);
    }
    
    public void act(){
        contaCiclo();
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
