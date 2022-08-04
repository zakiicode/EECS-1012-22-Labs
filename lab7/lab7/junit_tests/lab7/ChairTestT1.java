package lab7;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import java.lang.reflect.Field;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class ChairTestT1 {

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
    public void task_1_test_1_0_() {
        Chair c = new Chair();
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Computer";
        String expectedColor = "Blue";

        String errorType = String.format(
                "\n Test no-arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test no-arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_1_() {
        Chair c = new Chair("Computer", "Blue");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Computer";
        String expectedColor = "Blue";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_2_() {
        Chair c = new Chair("Conference", "Blue");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Conference";
        String expectedColor = "Blue";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_3_() {
        Chair c = new Chair("Executive", "Blue");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Executive";
        String expectedColor = "Blue";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_4_() {
        Chair c = new Chair("Computer", "Red");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Computer";
        String expectedColor = "Red";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_5_() {
        Chair c = new Chair("Conference", "Red");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Conference";
        String expectedColor = "Red";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_6_() {
        Chair c = new Chair("Executive", "Red");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Executive";
        String expectedColor = "Red";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_7_() {
        Chair c = new Chair("Computer", "Gray");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Computer";
        String expectedColor = "Gray";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_8_() {
        Chair c = new Chair("Conference", "Gray");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Conference";
        String expectedColor = "Gray";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_9_() {
        Chair c = new Chair("Executive", "Gray");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Executive";
        String expectedColor = "Gray";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }



    @Test
    public void task_1_test_1_10_() {
        Chair c = new Chair("Computer", "Yellow");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Computer";
        String expectedColor = "Yellow";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_11_() {
        Chair c = new Chair("Conference", "Yellow");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Conference";
        String expectedColor = "Yellow";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_12_() {
        Chair c = new Chair("Executive", "Yellow");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Executive";
        String expectedColor = "Yellow";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }
    @Test
    public void task_1_test_1_13_() {
        Chair c = new Chair("Computer", "White");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Computer";
        String expectedColor = "White";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_14_() {
        Chair c = new Chair("Conference", "White");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Conference";
        String expectedColor = "White";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_15_() {
        Chair c = new Chair("Executive", "White");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Executive";
        String expectedColor = "White";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }



    @Test
    public void task_1_test_1_16_() {
        Chair c = new Chair("Computer", "Orange");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Computer";
        String expectedColor = "Orange";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_17_() {
        Chair c = new Chair("Conference", "Orange");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Conference";
        String expectedColor = "Orange";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_18_() {
        Chair c = new Chair("Executive", "Orange");
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Executive";
        String expectedColor = "Orange";

        String errorType = String.format(
                "\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }



    @Test
    public void task_1_test_1_19_() {
        Chair c1 = new Chair("Computer", "White");
        Chair c =  new Chair(c1);
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Computer";
        String expectedColor = "White";

        String errorType = String.format(
                "\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_20_() {
        Chair c1 = new Chair("Conference", "White");
        Chair c =  new Chair(c1);
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Conference";
        String expectedColor = "White";

        String errorType = String.format(
                "\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_21_() {
        Chair c1 = new Chair("Executive", "White");
        Chair c =  new Chair(c1);
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Executive";
        String expectedColor = "White";

        String errorType = String.format(
                "\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }



    @Test
    public void task_1_test_1_22_() {
        Chair c1 = new Chair("Computer", "Orange");
        Chair c =  new Chair(c1);
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Computer";
        String expectedColor = "Orange";

        String errorType = String.format(
                "\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }

    @Test
    public void task_1_test_1_23_() {
        Chair c1 = new Chair("Conference", "Orange");
        Chair c =  new Chair(c1);
        String actualType = this.getchairType(c);
        String actualColor = this.getchairColor(c);

        String expectedType = "Conference";
        String expectedColor = "Orange";

        String errorType = String.format(
                "\n Test copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
                actualType, expectedType);
        assertTrue(errorType, expectedType.equals(actualType));

        String errorMsg = String.format(
                "\n Test copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
                actualColor, expectedColor);

        assertTrue(errorMsg, expectedColor.equals(actualColor));

    }



    @Test
    public void task_1_test_10_0_Exception() {
        try {
            Chair c = new Chair("Compter","Yellow");
            fail();
        }
        catch (IllegalArgumentException e) {
            // exception is expected and we catch it
        }
    }
    @Test
    public void task_1_test_10_1_Exception() {
        try {

            Chair c = new Chair("Computer","Yellew");
            fail();
        }
        catch (IllegalArgumentException e) {
            // exception is expected and we catch it
        }
    }


}