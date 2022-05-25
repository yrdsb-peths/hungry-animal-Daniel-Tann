import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label labelScore;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Elephant e = new Elephant();
        addObject(e,300, 375);
        
        labelScore = new Label(0, 50);
        addObject(labelScore, 20, 20);
        
        createBanana();
        
    }
    
    public void increaseScore()
    {
        score++;
        labelScore.setValue(score);
    }
    public void createBanana()
    {
        banana b = new banana();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(b,x,y);
    }
}
