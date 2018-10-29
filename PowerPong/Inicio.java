package PowerPong;

import greenfoot.*;

/**
 * Write a description of class MyWorldInicio here.
 * @author (your name) @version (a version number or a date)
 */
public class Inicio extends World
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private Integer ciclo = 0;
    private ImagemInicial imagemInicial = null;

    /**
     * Constructor for objects of class MyWorldInicio.
     */
    public Inicio()
    {
        super(700, 390, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        prepare();
        
        
    }
     
    public void act(){
        if(Greenfoot.mouseClicked(IniciarJogo.class)){
        Greenfoot.setWorld(new Jogo());
    }
    contaCiclo();
    }
    
    /**
     * 
     */
    private void prepare()
    {
        adicionaImagem();

        IniciarJogo iniciarjogo = new IniciarJogo();
        addObject(iniciarjogo,129,252);
        IniciaCréditos iniciacréditos = new IniciaCréditos();
        addObject(iniciacréditos,324,245);
        iniciarjogo.setLocation(116,245);
        iniciacréditos.setLocation(314,245);
        iniciacréditos.setLocation(321,245);
        IniciaRanking iniciaranking = new IniciaRanking();
        addObject(iniciaranking,556,243);
    }

    /**
     * 
     */
    public void adicionaImagem()
    {
        addObject( new  ImagemInicial(),370,127);
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
