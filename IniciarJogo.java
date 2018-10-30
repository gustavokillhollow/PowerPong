import java.util.*;
import greenfoot.*;

public class IniciarJogo extends Actor
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
            InputNomeJogadores World =(InputNomeJogadores) getWorld();
            World.desligaSom();
        }
}
