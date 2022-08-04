package lab7;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import java.lang.reflect.Field;

import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ChairTestT2 {

    public Timeout globalTimeout = Timeout.seconds(1);

    private String getchairType(Chair p) {
        String v="";
        try {
            Field name = Chair.class.getDeclaredField("chairType");
            name.setAccessible(true);
            v = (String)name.get(p);

        } catch (Exception x) {
            fail("exception occurred trying to get this.chairType");
            System.out.println(x.getMessage());
        }
        return v;
    }

    private String getchairColor(Chair p) {
        String v="";
        try {
            Field name = Chair.class.getDeclaredField("chairColor");
            name.setAccessible(true);
            v = (String)name.get(p);

        } catch (Exception x) {
            fail("exception occurred trying to get this.chairColor");
            System.out.println(x.getMessage());
        }
        return v;
    }


    @Test
    public void task_2_test_5_0_() {
        Chair c = new Chair();
        double actual =  c.getChairManufacturingCost();
        double expected = 84.75;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }

    @Test
    public void task_2_test_5_1_() {
        Chair c = new Chair("Computer","Blue");
        double actual =  c.getChairManufacturingCost();
        double expected = 84.75;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }
    @Test
    public void task_2_test_5_2_() {
        Chair c = new Chair("Computer","Yellow");
        double actual =  c.getChairManufacturingCost();
        double expected = 0.00;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }
    @Test
    public void task_2_test_5_3_() {
        Chair c = new Chair("Computer","Red");
        double actual =  c.getChairManufacturingCost();
        double expected = 96.05;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }
    @Test
    public void task_2_test_5_4_() {
        Chair c = new Chair("Computer","Gray");
        double actual =  c.getChairManufacturingCost();
        double expected = 79.10;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }
    @Test
    public void task_2_test_5_5_() {
        Chair c = new Chair("Conference","Gray");
        double actual =  c.getChairManufacturingCost();
        double expected = 96.05;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }
    @Test
    public void task_2_test_5_6_() {
        Chair c = new Chair("Conference","Blue");
        double actual =  c.getChairManufacturingCost();
        double expected = 90.40;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }

    @Test
    public void task_2_test_5_7_() {
        Chair c = new Chair("Conference","Yellow");
        double actual =  c.getChairManufacturingCost();
        double expected = 107.35;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }

    @Test
    public void task_2_test_5_8_() {
        Chair c = new Chair("Conference","White");
        double actual =  c.getChairManufacturingCost();
        double expected = 0.00;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }


    @Test
    public void task_2_test_5_9_() {
        Chair c = new Chair("Executive","White");
        double actual =  c.getChairManufacturingCost();
        double expected = 333.35;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }
    @Test
    public void task_2_test_5_10_() {
        Chair c = new Chair("Executive","Blue");
        double actual =  c.getChairManufacturingCost();
        double expected = 316.40;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }

    @Test
    public void task_2_test_5_11_() {
        Chair c = new Chair("Executive","Orange");
        double actual =  c.getChairManufacturingCost();
        double expected = 322.05;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }


    @Test
    public void task_2_test_5_12_() {
        Chair c = new Chair("Executive","Gray");
        double actual =  c.getChairManufacturingCost();
        double expected = 0.00;
        final double THRESHOLD = .01;
        String errorMsg = String.format(
                "\n Test getChairManufacturingCost  failed  Returned name ( %f ) " + " but correct name is ( %f ). \n",
                actual, expected);
        assertTrue(errorMsg, Math.abs(expected - actual) < THRESHOLD);
    }


}