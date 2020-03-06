import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


public class Greep extends Creature
{
    // Remember: you cannot extend the Greep's memory. So:
    // no additional fields (other than final fields) allowed in this
//class!


    /**
     * Default constructor for testing purposes.
     */
    public Greep()
    {
        this(null);
    }


    /**
     * Create a Greep with its home space ship.
     */
    public Greep(Ship ship)
    {
        super(ship);
    }


    /**
     * Do what a greep's gotta do.
     */


         public void act()
    {
        super.act();   // do not delete! leave as first statement in act().
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject(TomatoPile.class);
        Greep atTomato = (Greep) getOneIntersectingObject(Greep.class);
        worldEdge();
        if (carryingTomato())
        {
            spit("orange");
            if(atShip())
            {
                dropTomato();
                turn(180);
                setMemory(getRotation() / 20);
            }
            else
            {
                
                move(50);
                turnHome();
            }
       }
        else
       {
           if(seePaint("orange")){
            getOneIntersectingObject(TomatoPile.class);
               
             
            }
           
            if (getFlag(1))
            {
                turnToTomatoes();
                checkFood();                
                move();
            }


            else
            {                
                move();
                checkFood();
            }


        }


    }


    /**
     * Is there any food here where we are? If so, try to load some!
     */
    public void checkFood()
    {
        setFlag(1, false);
        // check whether there's a tomato pile here
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject
        (TomatoPile.class);
        if(tomatoes != null)
        {
            setFlag(1, true);
            loadTomato();
        }


    }


    /**
     * Return true if the greeps see a tomato pile.
     */


    public boolean seeFood()
    {
        if (getOneIntersectingObject(TomatoPile.class) == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }


    /**
     * Set the rotation in the direction  of the last tomato pile
sean.
     */


    public void turnToTomatoes()
    {
        if (seeFood())
        {
        int deltaX = getOneIntersectingObject(TomatoPile.class).getX()
- getX();
        int deltaY = getOneIntersectingObject(TomatoPile.class).getY()
- getY();
        setRotation((int) (180 * Math.atan2(deltaY, deltaX) /
Math.PI));
        }
    }


    public void worldEdge()
    {
        if (atWorldEdge())
        {
            turn(Greenfoot.getRandomNumber(90));
        }


        if (atWater())
        {
            turn(Greenfoot.getRandomNumber(150));
        }


    }


    /**
     * Act the proper way to fallow the paint.
     */
    public boolean seePaint()
    {
     if (seePaint("orange"))
        {


        }
        return true;
    }


    /**
     * Start a spit line.
     */
    public void startSpit()
    {
        if (getFlag(2))
        {
        spit("orange");
        }
    }


    public void fallowPaint()
    {
        turnHome();
        turn(180);
    }


    /**
     * This method specifies the name of the author (for display on
the result board).
     */
    public static String getAuthorName()
    {
        return "Globe roundabout";  // write your name here!
    }


    /**
     * This method specifies the image we want displayed at any time.
(No need
     * to change this for the competition.)
     */
    public String getCurrentImage()
    {
        if(carryingTomato())
            return "greep-with-food.png";
        else
            return "greep.png";
    }
}
