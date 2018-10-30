import java.util.*;
import greenfoot.*;

public class IniciaCréditos extends Actor
{

    public void act()
    {
         if (Greenfoot.mouseClicked(this)) {
            saiSom();
            Greenfoot.setWorld( new  Creditos());
        }
    }
    
    public void saiSom()
    {
            Inicio World =(Inicio) getWorld();
            World.desligaSom();
        }
}
