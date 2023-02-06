/**
 * @author N'ZO LAGOU
 * Exercise 1 : Walking The Dog
 * Instructions
 * In this exercise, we are going to have two classes, Dog and DogOwner.
 *
 * A dog needs to be take for a walk if it had a drink more than 4 hours ago.
 *
 * The file Dog.java, shown below, has three methods:
 *
 * setDrinkTime(int), which allows the time of drinking to be specified as an integer;
 *
 * getDrinkTime(), which returns the time of drinking;
 *
 * and needsToGo(), which is true if the dog needs to be taken for a walk.
 */
public class Dog {

    private int time;

    public void setDrinkTime(int time) {

        this.time = time;
    }

    public int getDrinkTime() {

        return this.time;
    }

    /**
     * The dog needs to go for a walk if it had a drink more than 4 hours ago;
     * i.e., if getDrinkTime() returns a value > 4.
     */
    public boolean needsToGo() {

        return getDrinkTime() > 4;
    }
}

