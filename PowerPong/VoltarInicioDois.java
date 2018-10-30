package PowerPong;

import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class VoltarInicioDois extends Actor
{

    /**
     * Act - do whatever the VoltarInicioDois wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
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
            Creditos World =(Creditos) getWorld();
            World.desligaSom();
        }
}
