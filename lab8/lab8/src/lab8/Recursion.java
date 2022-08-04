package lab8;

/**
 * NOTE: You must NOT use any kind of LOOP (neither for-loop nor while-loop) in any task of this lab.
 * Violating this rule will result in a mark of zero.
 */
public class Recursion {

    /**
     * Given a positive integer number, return the result of log(number) base 22,
     * with result rounded down to the floor integer.
     */
    public static int logarithmBase22(long number) {
        return (number > 22 - 1)? 1 + logarithmBase22(number/22): 0;
        // TODO Task 1: implement this recursive method
    }

    /**
     * Return the number of occurrences of the substring "LOL" in the input string
     *
     * Assumption: the inputStr consists of ONLY uppercase letter. It can be an empty string.
     *
     * Read the JUnit test cases for detailed specification.
     */
    //public static int count=0;
    public static int countLOL(String inputStr) {
        /*int count =0;
        System.out.println(inputStr);
        System.out.println(count);
        if(inputStr.length() <= 3){
            if (inputStr.equals("LOL")){
                count++;
                //System.out.println(count);
                return count;
            }
            else{
                return count;
            }
        }
        else if (inputStr.length() > 3){
            int where = inputStr.indexOf("LOL");

            if(where !=-1){
                count= count +1;
               // System.out.println(count +"yy");
                //System.out.println(inputStr.substring(0,where)+inputStr.substring(where+2,inputStr.length()));

                return countLOL(inputStr.substring(0,where)+inputStr.substring(where+3,inputStr.length()));
            }
        }
        // TODO Task 2: Complete this recursive method.
        return 0;

         */
        String left;
        if(inputStr.length() < 3)
            return 0;
        left = inputStr.substring(0, 3);
        if(left.equals("LOL"))
            return 1 + countLOL(inputStr.substring(2));

        return countLOL(inputStr.substring(1));
    }

    /**
     * Given an array of numbers that follow an increasing-then-decreasing order
     * (including the cases of only-increasing and only-decreasing),
     * return the index of the peak (maximum) element.
     *
     * Assumption:
     *  - All numbers in the input array are distinct.
     *  - The input array is non-empty.
     *
     * Read the JUnit test cases for detailed specification.
     */
    public static int findPeakIndex(int[] numbers) {

        // Do NOT modify this method. Implement the helper method instead.
        return findPeakIndexHelper(numbers, 0, numbers.length-1);
    }

    /**
     * Helper method for findPeakIndex
     */
    public static int findPeakIndexHelper(int[] numbers, int startIndex, int endIndex) {

        // TODO Task 3: Complete this recursive method.
        return startIndex;
    }
}

