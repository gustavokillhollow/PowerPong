package PowerPong;

import greenfoot.*;

public class Inicio extends World
{
    private Integer ciclo = 0;
    private ImagemInicial imagemInicial = null;
    GreenfootSound sound = new GreenfootSound("SomMario.wav");
   
    public Inicio()
    {
        super(700, 390, 1);
        prepare();
    }
    
    public void act(){
        //controleSom();
        IniciaJogo();
        contaCiclo();
    }
   
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
        removeObject(iniciarjogo);
        GetJogadores getjogadores = new GetJogadores();
        addObject(getjogadores,127,252);
        getjogadores.setLocation(119,244);
    }

    private void IniciaJogo(){
        sound.play();
    }
    
    public void desligaSom(){
       sound.stop();
    }
    
    public void adicionaImagem()
    {
        addObject( new  ImagemInicial(),370,127);
    }

    public void contaCiclo()
    {
        ciclo=ciclo+1;
    }

    public int getCiclo()
    {
        return ciclo;
    }
}
