package PowerPong;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarraCentral here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarraCentral extends Actor
{
    /**
     * Act - do whatever the BarraCentral wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
     public  BarraCentral(){
         GreenfootImage img = new GreenfootImage(6, 348);
         img.setColor(Color.WHITE);
         img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
         setImage(img);
    
    }
}
