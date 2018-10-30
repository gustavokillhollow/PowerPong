import java.util.*;
import greenfoot.*;

public class Restarte extends Actor
{

    public void act()
    {
         if (Greenfoot.mouseClicked(this)) {
            saiSom();
            Greenfoot.setWorld( new  Jogo());
        }
    }
    
    public void saiSom()
    {
          GameOver World =(GameOver) getWorld();
          World.desligaSom();
        }
}
