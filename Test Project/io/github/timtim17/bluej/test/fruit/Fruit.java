package io.github.timtim17.bluej.test.fruit;


/**
 * Write a description of interface Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Fruit
{
    default public String getName() {
        return "A Random Fruit";
    }
    
    default public void eat() {
        System.out.printf("Ate %s.%n", getName());
    }
}
