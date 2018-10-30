import lang.stride.*;
import java.util.*;
import greenfoot.*;

public class BarPowerPong2 extends Actor
{
    int barPowerWidth = 80;
    int barPowerHeight = 15;
    Pong2 pong2;
    public void act()
    {
        update();
        pong2.ligarBoost();
        pong2.controleBoost();
    }

    protected void addedToWorld(World world){
        super.addedToWorld(world);
        pong2 = ((Jogo)world).pong2;
    }

    public void update(){
        int timerBoost = pong2.timerBoost;
        setImage(new GreenfootImage(barPowerWidth + 2, barPowerHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, barPowerWidth + 1, barPowerHeight + 1);
        myImage.setColor(Color.GREEN);
        int tam = barPowerWidth * timerBoost / pong2.timerBoostTotal;
        myImage.fillRect(barPowerWidth - tam + 1, 1, tam, barPowerHeight);
    }

}
