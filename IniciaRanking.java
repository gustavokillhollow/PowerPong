import java.util.*;
import greenfoot.*;

public class IniciaRanking extends Actor
{
    public void act()
    {
         if (Greenfoot.mouseClicked(this)) {
            saiSom();
            Greenfoot.setWorld( new  Ranking() );
        }
    }
    
    public void saiSom()
    {
            GameOver World = (GameOver) getWorld();
            World.desligaSom();
        }
}
