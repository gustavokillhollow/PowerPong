import java.util.*;
import greenfoot.*;

public class GetJogadores extends Actor
{
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            saiSom();
            Greenfoot.setWorld( new  InputNomeJogadores());
        }
    }
    
    public void saiSom()
    {
            Inicio World =(Inicio) getWorld();
            World.desligaSom();
        }
}
