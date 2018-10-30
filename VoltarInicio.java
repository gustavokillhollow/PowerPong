import java.util.*;
import greenfoot.*;

public class VoltarInicio extends Actor
{
    public void act()
    {
         if (Greenfoot.mouseClicked(this)) {
            saiSom();
            Greenfoot.setWorld( new  Inicio());
        }
    }
    
    public void saiSom()
    {
            GameOver World =(GameOver) getWorld();
            World.desligaSom();
        }
}
