// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bug bug =  new  bug();
        addObject(bug, 84, 186);
        berry berry =  new  berry();
        addObject(berry, 251, 85);
        berry berry2 =  new  berry();
        addObject(berry2, 407, 218);
        berry berry3 =  new  berry();
        addObject(berry3, 209, 352);
        berry2.setLocation(493, 87);
        berry.setLocation(250, 51);
        berry2.setLocation(502, 137);
        berry3.setLocation(473, 293);
        berry berry4 =  new  berry();
        addObject(berry4, 305, 212);
        berry berry5 =  new  berry();
        addObject(berry5, 169, 344);
        snake snake =  new  snake();
        addObject(snake, 372, 52);
        snake snake2 =  new  snake();
        addObject(snake2, 299, 347);
    }
}
