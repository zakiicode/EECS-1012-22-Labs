package lab7;

// DO NOT MODIFY OR SUBMIT THIS FILE

/**
 * A class representing a Balloon.
 */
public class Balloon {

    private double capacity;        // the maximum amount of air that the balloon can hold
    private String colour;          // colour is a string with ONLY lowercase letter
    private double amount;          // the amount of air in the balloon
    private boolean popped;         // if the balloon is popped

    /**
     * Constructing a Balloon with a given colour and capacity.
     */
    public Balloon(String colour, double capacity) {

        this.colour = colour;
        this.capacity = capacity;
        this.amount = 0;
        this.popped = false;
    }

    // Getters

    String getColour() {
        return this.colour;
    }

    double getAmount() {
        return this.amount;
    }

    double getCapacity() {
        return this.capacity;
    }

    boolean isPopped() {
        return this.popped;
    }

    /**
     * Add a given amount of air to the balloon.
     * The balloon will pop if the amount of air exceeds the capacity.
     */
    void addAir(double amt) {

        if (!this.popped) {
            if (this.amount + amt > this.capacity) {
                this.pop();
            } else {
                this.amount += amt;
            }
        }
    }

    /**
     * Remove a given amount of air from the balloon.
     * The amount of air in the balloon should never become below zero.
     */
    void removeAir(double amt) {

        if (!this.popped) {
            this.amount = Math.max(0.0, this.amount - amt);
        }
    }

    /**
     * Pop the balloon.
     */
    void pop() {

        this.amount = 0;
        this.capacity = 0;
        this.popped = true;
    }
}
