import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fondo extends World
{
    Enemigo man = new Enemigo();
    public Fondo()
    {    
        super(700, 1000, 1); 
        addObject(new Player(), 350, 500);
        addObject(new Compa(), 350, 600);
        addObject(new Enemigo(), 350, 25);
        addObject(new enemigo1(), 175, 25);
        addObject(new enemigo2(),525, 25);
    }
}
