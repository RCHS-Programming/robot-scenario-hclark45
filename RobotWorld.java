import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hunter Clark
 * Write a description of class RobotWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Wall(),55,173);
        addObject(new Wall(),90,173);
        addObject(new Wall(),125,173);
        addObject(new Wall(),160,173);
        addObject(new Wall(),195,173);
        addObject(new Wall(),230,173);
        addObject(new Wall(),265,173);
        addObject(new Wall(),765,173);
        addObject(new Wall(),730,173);
        addObject(new Wall(),695,173);
        addObject(new Wall(),660,173);
        addObject(new Wall(),625,173);
        addObject(new Wall(),590,173);
        addObject(new Robot(),50,85);
        addObject(new Block(),430,173);
        addObject(new Pizza(),265,85);
        addObject(new Pizza(),625,85);
        addObject(new Pizza(),65,285);
        addObject(new Pizza(),430,325);
        addObject(new Pizza(),765,285);
        addObject(new Pizza(),265,525);
        addObject(new Pizza(),625,525);
        addObject(new Home(),740,545);
        
       
    }
    
}
