import greenfoot.*;  

public class Pong extends Actor
{
    final public int timerBoostTotal = 400;
    boolean statusBoost = false;
    public int timerBoost= 400;
    private int tempoDoModificadorTamanhoPad = 700;
    public int tamanhoPadAltura = 78;
    public int tamanhoPadLargura = 15;
    private GreenfootImage img;
    public void act() 
    {
        possoAndarParaCima();
        possoAndarParaBaixo();
        ligarBoost();
        TamanhoNormalPad();
    }

    public void ModificarTamanhoPad(){
        setTamanhoPadAltura(50); 
        img.scale(tamanhoPadLargura, tamanhoPadAltura); 
        img.setColor(Color.RED);
        img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
    }   

    public void TamanhoNormalPad(){
        if(getTamanhoPadAltura() == 50){
            tempoDoModificadorTamanhoPad--;
            if(tempoDoModificadorTamanhoPad == 0){
                setTamanhoPadAltura(78); 
                img.scale(tamanhoPadLargura, tamanhoPadAltura); 
                img.setColor(Color.WHITE);
                img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
            }
        }
    }

    public Pong(){
        img = new GreenfootImage(tamanhoPadLargura, tamanhoPadAltura);
        img.setColor(Color.WHITE);
        img.fillRect(0, 0,img.getWidth()-1, img.getHeight()-1);
        setImage(img);
    }

    public void possoAndarParaCima(){
        if(getY() > 67){     
            andarParaCima();
        }
    }
    
    public void possoAndarParaBaixo(){
        Actor barralateral2 = getOneIntersectingObject(BarraLateral2.class);
        if(barralateral2==null){
            andarParaBaixo();
        }
    }

    public void andarParaCima(){
        if(Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - velocidade());
            setRotation(0);
        }
    }   

    public void andarParaBaixo(){
        if(Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + velocidade());
            setRotation(0);
        }
    }

    public void ligarBoost(){
        if(Greenfoot.isKeyDown("e")){
            statusBoost = true;
        }
        controleBoost();
    }

    public void addTimeBoost(){
        setTimerBoost(400);
    }

    public void controleBoost(){
        if(getStatusBoost()){
            //1 segundo dura em media 60 ciclos;
            if(getTimerBoost() >= 0){
                setTimerBoost(getTimerBoost() - 1);
            }else{
                statusBoost = false;
            }
        }  
    }

    public int velocidade(){
        if(getStatusBoost()){
            return 12;    
        }else{
            return 3;    
        }
    }
    //Getters e Setters
    public void setTimerBoost(int valor){
        this.timerBoost = valor;
    }

    public void setStatusBoost(boolean valor){
        this.statusBoost = valor;
    }

    public void setTamanhoPadAltura(int valor){
        this.tamanhoPadAltura = valor;
    }

    public int getTimerBoost(){
        return this.timerBoost;
    }

    public boolean getStatusBoost(){
        return this.statusBoost;
    }   

    public int getTamanhoPadAltura(){
        return this.tamanhoPadAltura;
    }
}   
