import greenfoot.*;  
public class go extends Actor
{
    public int proximoPasso = 1;
    public static final int Taxa_de_Atualizacao = 50;
    public void act() 
    {
        saiGo();
    } 
    public void saiGo()
    {
        setImage(new GreenfootImage("numeros/num_"+proximoPasso+".png"));
        Jogo mundo = (Jogo) getWorld();        
        if(mundo.cicloAtual() % Taxa_de_Atualizacao == 0){
            proximoPasso++;
        }

        if(proximoPasso == 1){
            ligaSomGo();
        }
        
        if(proximoPasso > 5){
            mundo.iniciarSomGo = false;
            desligaSomGo();
            ligaSom();
            proximoPasso = 5;
        }
        
    }
    
    public void ligaSomGo(){
        Jogo World = (Jogo) getWorld();
        World.IniciaSomGo();
    }
     public void ligaSom()
    {
        Jogo World =(Jogo) getWorld();
        World.IniciaSom();
        }
        
    public void desligaSomGo()
    {
        Jogo World =(Jogo) getWorld();
        World.desligaSomGo();
        }
}
