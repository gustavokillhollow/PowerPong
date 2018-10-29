package PowerPong;

import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class Jogo extends World
{
    private int cicloAtual = 0; 
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private PlacarPong1 pontuacaoUm;
    private PlacarPong2 pontuacaoDois;
    private PlacarMatch numeroPartidas;
    private Integer ciclo = 0;
    public PlacarTime placartime;
    public Pong pong;
    public Pong2 pong2;
    public go proximoPasso;
    
    /**
     * Constructor for objects of class MyWorld.
     */
    public Jogo()
    {
        super(700, 390, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        prepare();
    } 
    
    public void act()
    {    
        cicloAtual++;
        criadorDeModificador();
        contaCiclo();
    }
    
    public boolean oTempoEstaZerado(){
        return this.placartime.valor == 1; 
    }
    
    public void criadorDeModificador(){
        if(cicloAtual() %  900 == 0 ){
        int x = Greenfoot.getRandomNumber(560) + 78  ;
        int y = Greenfoot.getRandomNumber(310) + 40 ;
        addObject(new ModificadorGanharPowerBoost(), x,y);
        
       }
    }
    
   
    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        BarraLateral barraLateral =  new  BarraLateral();
        addObject(barraLateral, 350, 22);
        BarraLateral2 barraLateral2 =  new  BarraLateral2();
        addObject(barraLateral2, 350, 367);
        Score score =  new  Score();
        addObject(score, 22, 8);
        Score score2 =  new  Score();
        addObject(score2, 614, 8);
        Time time =  new  Time();
        addObject(time, 459, 9);
        Match match =  new  Match();
        addObject(match, 192, 8);
        time.setLocation(476, 12);
        match.setLocation(218, 9);
        time.setLocation(473, 13);
        time.setLocation(487, 14);
        time.setLocation(483, 12);
        time.setLocation(485, 57);
        removeObject(time);
        Time time2 =  new  Time();
        addObject(time2, 459, 9);
        BarraCentral barraCentral =  new  BarraCentral();
        addObject(barraCentral, getWidth()/2, 195);
        this.pong2 =  new  Pong2();
        addObject(this.pong2, 660, 200);
        this.pong =  new  Pong();
        addObject(this.pong, 50, 200);
        addBola();
        this.pontuacaoUm =  new  PlacarPong1();
        addObject(this.pontuacaoUm, 73, 9);
        this.pontuacaoDois =  new  PlacarPong2();
        addObject(this.pontuacaoDois, 665, 9);
        this.numeroPartidas = new PlacarMatch();
        addObject(this.numeroPartidas,259,9);
        this.placartime =  new  PlacarTime();
        addObject(placartime, 518, 115);
        placartime.setLocation(495, 8);
        placartime.setLocation(497, 8);
        BarPowerPong barPowerPong = new BarPowerPong();
        addObject(barPowerPong, 50,380);
        BarPowerPong2 barPowerPong2 = new BarPowerPong2();
        addObject(barPowerPong2,  645, 380);
        go go = new go();
        addObject(go,354,189);        
    }

    public int cicloAtual(){
        return cicloAtual;
    }

    public void addBola(){                
        addObject(new Bola(), 351, 190);
    }
    
    public void acrescentaPontosUm(int valor){
        pontuacaoUm.addPontos(valor);
    }
    
    public int getCiclo()
    {
        return ciclo;
    }

    public void acrescentaPontosPartida(int valorPartida)
    {
        numeroPartidas.addPartidas(valorPartida);
    }    

    public void contaCiclo()
    {
        ciclo = ciclo + 1;
    }

    public void acrescentaPontosDois(int valor){
        pontuacaoDois.addPontos(valor);        
    }

}
