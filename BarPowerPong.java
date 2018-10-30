
import greenfoot.*;  
public class BarPowerPong extends Actor
{

    //final int boostCiclos = 200;
    int barPowerWidth = 80;
    int barPowerHeight = 15;
    Pong pong;
    
    protected void addedToWorld(World world)
    {
        super.addedToWorld(world);
        pong = ((Jogo)world).pong;
    }

    public void act() 
    {
        update();
        pong.ligarBoost();
        pong.controleBoost();
        

    }    
    
    public void update(){
        int timerBoost = pong.timerBoost;
        setImage(new GreenfootImage(barPowerWidth + 2, barPowerHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, barPowerWidth + 1, barPowerHeight + 1);
        myImage.setColor(Color.GREEN);
        int tam =  barPowerWidth * timerBoost / pong.timerBoostTotal ;
        myImage.fillRect(1 , 1, tam, barPowerHeight);
 
    }
    
   
             
}
