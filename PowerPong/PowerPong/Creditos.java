package PowerPong.PowerPong;

import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Creditos extends World
{

    /**
     * Constructor for objects of class Créditos.
     */
    public Creditos()
    {
        super(700, 390, 1);
        prepare();
    }

    public void act(){
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        ImagemCreditos imagemcreditos = new ImagemCreditos();
        addObject(imagemcreditos,356,198);
        
        VoltarInicio voltarinicio2 = new VoltarInicio();
        addObject(voltarinicio2,343,347);
        
        
    }
}
