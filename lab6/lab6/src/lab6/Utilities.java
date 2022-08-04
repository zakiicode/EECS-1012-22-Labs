package lab6;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getMultiplesOf3(int[] numbers) {

        int count =0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%3 == 0) {
                count++;
            }
        }
        int [] multiple = new int[count];
        int newcnt =0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%3 == 0) {
                multiple[newcnt]= numbers[i];
                newcnt++;
            }
        }

        /* TODO: Your implementation ends here. */

        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        return multiple; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Assumptions:
     * 	- numbers.length >= 1
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static String[] getAllPrefixes(int[] numbers) {
        String[] prefix = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            prefix[i]="[";
            for (int j = 0; j < i+1; j++) {
                prefix[i]=prefix[i]+numbers[j];
                if(j!=i){
                    prefix[i]=prefix[i]+", ";

                }

            }
            prefix[i]=prefix[i]+"]";

        }
        /* TODO: Your implementation ends here. */

        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        return prefix; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `numbers` : an array of integers
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] getGroupedNumbers(int[] numbers) {
        int[] group = new int[numbers.length];
        int pos =0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%3==0){
                group[pos]=numbers[i];
                pos++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%3==1){
                group[pos]=numbers[i];
                pos++;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%3==2){
                group[pos]=numbers[i];
                pos++;
            }
        }
        /* TODO: Your implementation ends here. */

        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        return group; // You need to replace this line by returning the proper result.
    }

    /*
     * Input parameters:
     * 	- `twoDimArray` : a 2D array of integers
     *
     * Note: the sub-arrays may have different sizes.
     *
     * Refer to you lab instructions for what the method should return.
     */
    public static int[] zigZagFlatten(int[][] twoDimArray) {
        int count=0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                count++;
            }
        }

        int[]zigzag = new int[count];
        int row=1;
        int newcnt =0 ;
        for (int i = 0; i < twoDimArray.length; i++) {
            if((row) % 2 == 0) {
                    for (int j = twoDimArray[i].length-1; j >= 0; j--) {
                        zigzag[newcnt] = twoDimArray[i][j];
                        newcnt++;
                }
            }
            else{
                for (int j = 0; j < twoDimArray[i].length; j++) {
                    zigzag[newcnt] = twoDimArray[i][j];
                    newcnt++;
                }
            }
            row++;
        }

        /* TODO: Your implementation ends here. */

        /* Your implementation of this method starts here.
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */
        return zigzag; // You need to replace this line by returning the proper result.
    }
}
