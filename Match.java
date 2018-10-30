import greenfoot.*;  
public class Match extends Actor
{
    public void act() 
    {

    }  

    private int contadorPartidas = 0;
    
    public Match(){
        GreenfootImage img = new GreenfootImage("Match.png");
        //img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
        setImage(img);
    }
}
