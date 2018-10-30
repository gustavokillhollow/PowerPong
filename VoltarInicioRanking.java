import java.util.*;
import greenfoot.*;

public class VoltarInicioRanking extends Actor
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
         Ranking World =(Ranking) getWorld();
         World.desligaSom();
        }
}
