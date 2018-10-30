import java.util.*;
import greenfoot.*;

public class SpeedUp extends Actor
{

    public int proximoPasso = 0; 
    public void act()
    {
        trocaImg1();
        trocaImg2();
        trocaImg3();
        voltaImg();
    }
    
    public void trocaImg1(){
        setImage(new GreenfootImage("SpeedUp_"+proximoPasso+".png"));
        Jogo mundo = getWorldOfType(Jogo.class);
        if(mundo.tempoQuaseZero()){
            proximoPasso = proximoPasso + 1;
        }
    }
    
    public void trocaImg2(){
        setImage(new GreenfootImage("SpeedUp_"+proximoPasso+".png"));
        Jogo mundo = getWorldOfType(Jogo.class);
        if(mundo.oTempoEstaZerado()){
            proximoPasso = proximoPasso + 1;
        }
    }
    
    public void trocaImg3(){
        setImage(new GreenfootImage("SpeedUp_"+proximoPasso+".png"));
        Jogo mundo = getWorldOfType(Jogo.class);
        if(mundo.tempoBaixo()){
            proximoPasso = proximoPasso + 1;
        }
    }
    
    public void voltaImg(){
        if(proximoPasso == 3){
            proximoPasso = 0;

        }
    }
}
