import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigo1 extends Actor
{
    /**
     * Act - do whatever the enemigo1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
    public void move()
    { 
        setLocation(getX(), getY() +5);    
    }
}
