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
    }
    
    public void setDirection(int Direction){
        switch(Direction){
            case Left:
                
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()-5, getY());
                } else {
                    setLocation(getX()-5, getY());}
                    break;
            case Right:
                
                if(Greenfoot.isKeyDown("space")){
                    setLocation(getX()+5, getY());
                } else {
                    setLocation(getX()+5, getY());}
                    break;
                }
            }
                }

     

