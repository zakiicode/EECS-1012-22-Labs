package lab7;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertSame;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BalloonManagerTestC2 {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);


    @Test
    public void test_Task2_00_Four_PopTwo() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("red", 8);
        Balloon b2 = new Balloon("green", 7);
        Balloon b3 = new Balloon("blue", 1);
        Balloon b4 = new Balloon("yellow", 12);
        b1.addAir(3);
        b2.addAir(5);
        b3.pop();
        b4.addAir(6);
        manager.addBalloon(b1);
        manager.addBalloon(b2);
        manager.addBalloon(b3);
        manager.addBalloon(b4);
        ArrayList<Balloon> removed = manager.removeLessThanHalfFull();
        ArrayList<Balloon> expectedRemoved = new ArrayList<>(List.of(b1, b3));
        ArrayList<Balloon> expectedKept = new ArrayList<>(List.of(b2, b4));

        assertEquals(expectedRemoved.size(), removed.size());
        assertEquals(expectedKept.size(), manager.getBalloons().size());
        for (int i = 0; i < removed.size(); i++) {
            assertSame(expectedRemoved.get(i), removed.get(i));
        }
        for (int i = 0; i < expectedKept.size(); i++) {
            assertSame(expectedKept.get(i), manager.getBalloons().get(i));
        }
    }

    @Test
    public void marking_Task2_01_OneRemove() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("green", 90);
        b1.addAir(43);
        manager.addBalloon(b1);
        ArrayList<Balloon> removed = manager.removeLessThanHalfFull();
        ArrayList<Balloon> expectedRemoved = new ArrayList<>(List.of(b1));
        ArrayList<Balloon> expectedKept = new ArrayList<>();

        assertEquals(removed.size(), expectedRemoved.size());
        assertEquals(expectedKept.size(), manager.getBalloons().size());
        for (int i = 0; i < removed.size(); i++) {
            assertSame(removed.get(i), expectedRemoved.get(i));
        }
        for (int i = 0; i < expectedKept.size(); i++) {
            assertSame(expectedKept.get(i), manager.getBalloons().get(i));
        }
    }

    @Test
    public void marking_Task2_02_OneNotRemove() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("green", 90);
        b1.addAir(46);
        manager.addBalloon(b1);
        ArrayList<Balloon> removed = manager.removeLessThanHalfFull();
        ArrayList<Balloon> expectedRemoved = new ArrayList<>();
        ArrayList<Balloon> expectedKept = new ArrayList<>(List.of(b1));

        assertEquals(removed.size(), expectedRemoved.size());
        assertEquals(expectedKept.size(), manager.getBalloons().size());
        for (int i = 0; i < removed.size(); i++) {
            assertSame(removed.get(i), expectedRemoved.get(i));
        }
        for (int i = 0; i < expectedKept.size(); i++) {
            assertSame(expectedKept.get(i), manager.getBalloons().get(i));
        }
    }

    @Test
    public void marking_Task2_03_TwoRemoveOne() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("green", 90);
        Balloon b2 = new Balloon("blue", 33);
        b1.addAir(46);
        b2.addAir(11);
        manager.addBalloon(b1);
        manager.addBalloon(b2);
        ArrayList<Balloon> removed = manager.removeLessThanHalfFull();
        ArrayList<Balloon> expectedRemoved = new ArrayList<>(List.of(b2));
        ArrayList<Balloon> expectedKept = new ArrayList<>(List.of(b1));

        assertEquals(removed.size(), expectedRemoved.size());
        assertEquals(expectedKept.size(), manager.getBalloons().size());
        for (int i = 0; i < removed.size(); i++) {
            assertSame(removed.get(i), expectedRemoved.get(i));
        }
        for (int i = 0; i < expectedKept.size(); i++) {
            assertSame(expectedKept.get(i), manager.getBalloons().get(i));
        }
    }

    @Test
    public void marking_Task2_04_Mix() {

        BalloonManager manager = new BalloonManager();
        Balloon b1 = new Balloon("green", 90);
        Balloon b2 = new Balloon("blue", 33);
        Balloon b3 = new Balloon("yellow", 1000);
        b1.addAir(46);
        b2.addAir(11);
        b3.pop();
        manager.addBalloon(b1);
        manager.addBalloon(b2);
        manager.addBalloon(b3);
        ArrayList<Balloon> removed = manager.removeLessThanHalfFull();
        ArrayList<Balloon> expectedRemoved = new ArrayList<>(List.of(b2, b3));
        ArrayList<Balloon> expectedKept = new ArrayList<>(List.of(b1));

        assertEquals(removed.size(), expectedRemoved.size());
        assertEquals(expectedKept.size(), manager.getBalloons().size());
        for (int i = 0; i < removed.size(); i++) {
            assertSame(removed.get(i), expectedRemoved.get(i));
        }
        for (int i = 0; i < expectedKept.size(); i++) {
            assertSame(expectedKept.get(i), manager.getBalloons().get(i));
        }
    }
}