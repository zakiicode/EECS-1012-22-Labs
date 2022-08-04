package lab7;


import java.util.*;
// Do NOT add any other import statement

public class BalloonManager {

    private ArrayList<Balloon> balloons;

    public BalloonManager() {
        balloons = new ArrayList<>();
    }

    public ArrayList<Balloon> getBalloons() {
        return this.balloons;
    }

    public void addBalloon(Balloon ball) {
        this.balloons.add(ball);
    }

    /**
     * Return a list of "singular" colours among the balloons in the balloon manager.
     * A colour is "singular" if and only if it appears exactly once in the balloons.
     *
     * Refer to the test handout for specification.
     */
    public ArrayList<String> singularColours() {
        String col = " ";
        String col2 = " ";
        int redcnt = 0;
        int blecnt = 0;
        int greecnt = 0;
        int yelcnt = 0;
        ArrayList<String> balloo = new ArrayList<String>();
        ArrayList<Integer> occur = new ArrayList<Integer>();


        for (int i = 0; i < balloons.size(); i++) {
            col = (getBalloons().get(i).getColour());

            if (col.equals("red")) {
                redcnt++;
            } else if (col.equals("blue")) {
                blecnt++;

            } else if (col.equals("yellow")) {
                yelcnt++;
            } else if (col.equals("green")) {
                greecnt++;

            }
        }
        if (redcnt == 1) {
            balloo.add("red");
        }
        if (blecnt == 1) {
            balloo.add("blue");
        }
        if (yelcnt == 1) {
            balloo.add("yellow");
        }
        if (greecnt == 1) {
            balloo.add("green");
        }
        // TODO Task 1: complete this method
        return balloo;

    }


    /**
     * Remove and return (as a list) all balloons that are less than half full or popped.
     *
     * Refer to the test handout for specification.
     */
    public ArrayList<Balloon> removeLessThanHalfFull() {
        ArrayList<Balloon> balloonnns = new ArrayList<Balloon>();
        double air = 0.0;
        double total = 0.0;

        for (int i = 0; i < balloons.size(); i++) {
            air= (getBalloons().get(i).getAmount());
            total = (getBalloons().get(i).getCapacity());

            if(air < (total/2)){
                balloonnns.add(getBalloons().get(i));
                getBalloons().remove(i);
            }
            else if(getBalloons().get(i).isPopped()){
                balloonnns.add(getBalloons().get(i));
                getBalloons().remove(i);
            }
        }
        // TODO Task 2: complete this method
        return balloonnns;
    }
}
