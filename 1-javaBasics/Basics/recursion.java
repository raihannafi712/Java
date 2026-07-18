public class recursion {

    //                          /* Sum of serial numbers start */

    // public static void sumNum (int num){       /* Basic method (not needed for the recursive method) */
    //     int total = 0;
    //     for (int i = 1; i <= num; i++) {
    //         total += i;
    //     }
    //     System.out.println(total);
    // }


    // public static int sumNumR (int num){           /* Recursive method */

    //     if (num == 1) {          /* base case */
    //         return 1;
    //     }else{                   /* recursive case */
    //         return num + sumNumR(num - 1);
    //     }   
    // }

    //                          /* Sum of serial numbers end */



    //                          /* Factorial problem start*/

    // public static int factorial (int num){         /* Basic method */
    //     int result = 1;
    //     if (num != 0) {
    //         for (int i = 1; i <= num; i++) {
    //             result = result * i;
    //         }
    //     }
    //     return result;
    // }

    // public static int factorialR (int num){

    //     if (num == 0) {
            
    //         return 1;
    //     }else{
    //         return num * factorialR(num - 1);
    //     }
    // }


    //                          /* Factorial problem end*/ 



    //                          /* Reverse integer problem start */

    // public static void printRev (int num){          /*Basic method  */

    //     int count = num;
    //     while (count > 0) {
    //         System.out.println(count);
    //         count--;
    //     }
    // }

    public static void printRevR(int num){            /* Recursive method */
        if (num == 0) {
            return;
        }else{
            System.out.println(num);
            printRevR(num - 1);
        }
    }


    //                          /* Reverse integer problem end */

    public static void main(String[] args) {

        //                          /* Reverse integer problem start */

        // printRev(6);
        printRevR(6);

        //                          /* Reverse integer problem end */




    //                          /* Factorial problem start*/

        // int result = factorial(4);

        // System.out.println(result);

    //                          /* Factorial problem end*/






    //                         /* Sum of serial numbers start */

    //    int result = sumNumR(5);
    //    System.out.println(result);

















    }
}
