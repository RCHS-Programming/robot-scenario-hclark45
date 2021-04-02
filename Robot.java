import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage ("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage ("man02.png");
   /**
    * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
   public void Act ()
    {
        robotMovement();
        detectWallCollision();
        detectHome();
        eatPizza();
        animate();
        detectBlockCollision();
        
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
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectBlockCollision()
    {
        if (isTouching(Wall.class))
        {
            setLocation(50,85);
            Greenfoot.playSound("hurt.wav");
        }
    }
    public void detectHome()
    {  if (isTouching(Home.class))
        {
            setLocation(50,85);
            Greenfoot.playSound("yipee.wav");
        }
    }
    public void eatPizza()
    {
        if (isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
        }
    }
    public void switchImage()
    {
      if (getImage() == robotimage1)
        {setImage ( robotimage2 );
        }
        else
        {setImage ( robotimage1 );
        }  
    }
}
    
