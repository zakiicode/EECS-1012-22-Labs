package lab7;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BalloonManagerTestC1 {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);
    @Test
    public void test_Task1_00_RBYRRBG() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("red", 10.0);
        Balloon b2 = new Balloon("blue", 20.0);
        Balloon b3 = new Balloon("yellow", 10.0);
        Balloon b4 = new Balloon("red", 30.0);
        Balloon b5 = new Balloon("red", 30.0);
        Balloon b6 = new Balloon("blue", 30.0);
        Balloon b7 = new Balloon("green", 30.0);
        manager.addBalloon(b1);
        manager.addBalloon(b2);
        manager.addBalloon(b3);
        manager.addBalloon(b4);
        manager.addBalloon(b5);
        manager.addBalloon(b6);
        manager.addBalloon(b7);
        b2.pop();

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("green", "yellow"));
        List<String> actual = manager.singularColours();
        Collections.sort(actual);
        assertArrayEquals(expected.toArray(), actual.toArray());

        // checking that the balloons attribute is not modified
        ArrayList<Balloon> currentBalloons = manager.getBalloons();
        assertEquals(7, currentBalloons.size());
        assertEquals("red", currentBalloons.get(0).getColour());
        assertEquals("blue", currentBalloons.get(1).getColour());
        assertEquals("yellow", currentBalloons.get(2).getColour());
        assertEquals("red", currentBalloons.get(3).getColour());
        assertEquals("red", currentBalloons.get(4).getColour());
        assertEquals("blue", currentBalloons.get(5).getColour());
        assertEquals("green", currentBalloons.get(6).getColour());
    }
    @Test
    public void marking_Task1_01_OneBalloon() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("pink", 10.0);
        manager.addBalloon(b1);

        ArrayList<String> expected = new ArrayList<>(Arrays.asList("pink"));
        List<String> actual = manager.singularColours();
        Collections.sort(actual);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void marking_Task1_02_TwoSame() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("pink", 10.0);
        Balloon b2 = new Balloon("pink", 20.0);
        manager.addBalloon(b1);
        manager.addBalloon(b2);

        ArrayList<String> expected = new ArrayList<>();
        List<String> actual = manager.singularColours();
        Collections.sort(actual);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void marking_Task1_03_TwoDiff() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("pink", 10.0);
        Balloon b2 = new Balloon("blue", 20.0);
        manager.addBalloon(b1);
        manager.addBalloon(b2);

        ArrayList<String> expected = new ArrayList<>(List.of("blue", "pink"));
        List<String> actual = manager.singularColours();
        Collections.sort(actual);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void marking_Task1_04_Three() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("pink", 10.0);
        Balloon b2 = new Balloon("blue", 20.0);
        Balloon b3 = new Balloon("pink", 30.0);
        manager.addBalloon(b1);
        manager.addBalloon(b2);
        manager.addBalloon(b3);

        ArrayList<String> expected = new ArrayList<>(List.of("blue"));
        List<String> actual = manager.singularColours();
        Collections.sort(actual);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }


}