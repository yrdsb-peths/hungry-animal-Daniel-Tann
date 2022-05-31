import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound yumBanana = new GreenfootSound("banana.m4a");

    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Dashing left or right
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("shift"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("d") && Greenfoot.isKeyDown("shift"))
        {
            move(5);
        }
        //Moving Normally
        if(Greenfoot.isKeyDown("a"))
        {
            move(-1);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(1);
        }
        eat();
    }
    public void eat()
    {
        if(isTouching(banana.class))
        {
            removeTouching(banana.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.createBanana();
            yumBanana.play();
        }
    }
}
