// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class bug extends Actor
{
    private int score = 0;

    /**
     * Act - do whatever the bug wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        eatberry();
    }

    /**
     * 
     */
    public void eatberry()
    {
        if (isTouching(berry.class)) {
            removeTouching(berry.class);
            score = score + 1;
            getWorld().showText("Score: " + score, 100, 30);
        }
    }
}
