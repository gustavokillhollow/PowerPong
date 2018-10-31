import greenfoot.*;

public class Inicio extends World
{
    private Integer ciclo = 0;
    private ImagemInicial imagemInicial = null;
    GreenfootSound sound = new GreenfootSound("ErroWindo.wav");
   
    public Inicio()
    {
        super(700, 390, 1);
        prepare();
    }
    
    public void act(){
        IniciaJogo();
        contaCiclo();
    }
   
    private void prepare()
    {
        adicionaImagem();
        IniciarJogo iniciarjogo = new IniciarJogo();
        addObject(iniciarjogo,294,233);
        iniciarjogo.setLocation(334,268);
        removeObject(iniciarjogo);

        IniciaCréditos iniciacréditos = new IniciaCréditos();
        addObject(iniciacréditos,542,241);

        GetJogadores getjogadores = new GetJogadores();
        addObject(getjogadores,119,244);

       
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
