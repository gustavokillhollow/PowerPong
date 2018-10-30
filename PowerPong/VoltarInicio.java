package PowerPong;

import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class VoltarInicio extends Actor
{

    /**
     * Act - do whatever the VoltarInicio wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
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
