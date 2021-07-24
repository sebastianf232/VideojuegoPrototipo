import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public static final int Right=0;
    public static final int Left=1;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            setDirection(Left);
        }
        
        if(Greenfoot.isKeyDown("right")){
            setDirection(Right);
        }
        hasCollided();
    }
    
    public void hasCollided()
    {
        Actor Enemigo = getOneObjectAtOffset(0,0, Enemigo.class);
        if(Enemigo != null) {
            Fondo world = (Fondo) getWorld();
            world.removeObject(Enemigo);
        }
        
        Actor enemigo1 = getOneObjectAtOffset(0,0, enemigo1.class);
        if(enemigo1 != null) {
            Fondo world = (Fondo) getWorld();
            world.removeObject(enemigo1);
        }
        
        Actor enemigo2 = getOneObjectAtOffset(0,0, enemigo2.class);
        if(enemigo2 != null) {
            Fondo world = (Fondo) getWorld();
            world.removeObject(enemigo2);
        }
     
    }
    public void setDirection(int Direction){
        switch(Direction){
            case Left:
                
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()-7, getY());
                } else {
                    setLocation(getX()-7, getY());}
                    break;
            case Right:
                
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()+7, getY());
                } else {
                    setLocation(getX()+7, getY());}
                    break;
                }
            }
 }

     

