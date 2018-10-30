import greenfoot.*; 
public class BarraLateral extends Actor
{
   
    public void act() 
    {
        
    }   

    public  BarraLateral(){
        GreenfootImage img = new GreenfootImage(700, 6);
        img.setColor(Color.WHITE);
        img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
        setImage(img);
    }
}
