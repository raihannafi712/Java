import java.util.Arrays;

public class methods {

        //                              /* Method 1 */

        // public static int basicMethod(){       /* method's parameters aren't mandatory and they don't have to match with return type */
        //     int first = 12;
        //     int second = 14;
        //     System.out.println(second + " and " + first);      /* doesn't matter what variable is returned, if the method is called, both variable can be showed */
        //     return first;              
        // }



        //                              /* Method 2 */

        // public static int methodWithParameters(int a , int b){
        //     System.out.println(a + " and " + b);        /* value is given in the main method */
        //     return a;
        // }





        //                                         /*  */
   
        // public static void method1(int n1 , String s1 ){
        //     System.out.println( n1 + s1);
        // }




        // //                                      /* To receive array  */

        // public static void method2(int [] n2){
        //     System.out.println(Arrays.toString(n2));
        // }



        //                                         /*  */

        // public static int sumOfSquare (int a , int b) {

        //     int ans = makeSquare(a) + makeSquare(b);
        //     return ans;
        // }




        //                                        /*  */

        // public static int makeSquare(int n){
        //     return n*n;
        // }

        // public static String func1(){
        //     return "CSE " + func2();
        // }


        // public static String func2(){
        //     return "is " + func3();
        // }
   

        // public static String func3(){
        //     return "bad";
        // }

   
   
   

    public static void main(String[] args) {

            //                              /* Method 1 */

            // basicMethod();
            // System.out.println(basicMethod());       /* only the return variable comes here */






            //                              /* Method 2 */

            // methodWithParameters(4, 5);





            
        
            //                                  /* method 1 */
            // method1(78 , " haha");          /* New method has to be connected with main method */  /* method calling(arguments) and the arguments must match with the method1 parameter's datatype */
            // int [] arr1 = {1,2,3,4,5,6,67,7};  


            //                                  /*method 2  */   
            // method2(arr1);   


            //                                  /* method 3 */
            // int result = sumOfSquare(3,9);
            // System.out.println(result);


            //                                  /* method 4 */
            // System.out.println(func1());




    }
}
