package PowerPong;

import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Creditos extends World
{
    GreenfootSound sound = new GreenfootSound("jackass.wav");
    /**
     * Constructor for objects of class Créditos.
     */
    public Creditos()
    {
        super(700, 390, 1);
        prepare();
    }

    public void act(){
        sound.play();
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        ImagemCreditos imagemcreditos = new ImagemCreditos();
        addObject(imagemcreditos,356,198);
        VoltarInicioDois voltariniciodois = new VoltarInicioDois();
        addObject(voltariniciodois,335,361);
        voltariniciodois.setLocation(323,349);
    }
    
    public void desligaSom(){
       sound.stop();
    }
}
