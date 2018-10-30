import java.util.*;
import greenfoot.*;

public class VoltarInicioDois extends Actor
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
            Creditos World =(Creditos) getWorld();
            World.desligaSom();
        }
}
