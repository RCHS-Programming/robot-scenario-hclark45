import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
   /**
    * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
   public void Act ()
    {
        robotMovement();
        detectWallCollision();
        
    }
    public void robotMovement() 
    {
      if (Greenfoot.isKeyDown("up"))
      { 
          setLocation( getX(), getY() -3 );
      }
       if (Greenfoot.isKeyDown("down"))
      { 
          setLocation( getX(), getY() +3 ); 
      }
       if (Greenfoot.isKeyDown("right"))
      { 
          setLocation( getY(), getX() +3 );
      }
       if (Greenfoot.isKeyDown("left"))
      { 
          setLocation( getY(), getX() -3 );
      }
    }    
    public void detectWallCollision()
    {
        if (isTouching(Wall.class))
        {
            setLocation(50,85);
        }
    }
    public void detectBlockCollision()
    {
        if (isTouching(Wall.class))
        {
            setLocation(50,85);
        }
    }
}
