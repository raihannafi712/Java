package newLab;

import java.util.Scanner;

public class lab9 {

    // Lab tasks

    // TASK 1

    // A
    // public static void oneToN(int a , int b){
    //     if (a > b) {
    //         return;
    //     }
    //     System.out.print(a + " ");

    //     oneToN(a + 1, b);
    // }


    // // B
    // public static void nToOne(int start , int end){
    //     if (end < start) {
    //         return;
    //     }
    //     System.out.print(end + " ");
    //     nToOne(start, end - 1);
    // }


    // // C
    // public static int recursiveSum(int start , int end){    /* If the method returns a value then the recursive call will be in return */

    //     if (start > end) {
    //         return 0;
    //     }
        
    //     return start + recursiveSum(start + 1, end);

    // }





    // TASK 2

    // public static void reverseDigits(int n){
    //     if (n == 0) {
    //         return;
    //     }

    //     System.out.println(n % 10);
    //     reverseDigits(n / 10);

    // }


    // // TASK 3
    // public static int sumDigits(int n){
    //     if (n == 0) {
    //         return 0;
    //     }

    //     return (n % 10) + sumDigits(n/10);

    // }


    // // TASK 4
    // public static String reverse_string(String a , int b){

    //     if (b == a.length()) {
    //         return "";
    //     }

    //     return reverse_string(a, b + 1) + a.charAt(b);

    // }






    // Home tasks

    // TASK 1
    public static int factorial(int n){
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }


    // TASK 2
    // public static int power(int a , int b){
    //     if (b == 0) {
    //         return 1;
    //     }

    //     return a * power(a, b - 1);

    // }



    // TASK 3
    public static void print_element(int [] a , int b){
        if (b == a.length) {
            return ;
        }

        System.out.println(a[b] + " ");
        print_element(a, b + 1);

    }


    // TASK 4           /* Memorize */
    // Fibonacci (5) > 0+1 = 1 , 1 + 1 = 2 , 2 + 1 = 3, 3 + 2= 5

    public static int fibonacci(int n){
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    





















    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("N:");
        // int N = sc.nextInt();

        // oneToN(1,N);

        // nToOne(1,N);

        // System.out.println(recursiveSum(1,N));

        // reverseDigits(N);

        // int x = sumDigits(N);
        // System.out.println(x);

        // System.out.println(reverse_string("Hello", 0));

        // int x = factorial(N);
        // System.out.println(x);

        // int x = power(8,4);
        // System.out.println(x);

        // int[] arr = {5,6,2,1,8,7};
        // int index = 2;
        // print_element(arr, index);

        System.out.println(fibonacci(9));










    //     // int x = factorial(n);
    //     // System.out.println(x);

    //     // int x = power(5, 3);
    //     // System.out.println(x); 

    //     // int[] arr1 = {5, 6, 2, 1, 8, 7};
    //     // int index1 = 2;
    //     // print_elements(arr1, index1);

    //     // System.out.println(fibonacci(0)); // Output: 0
    //     // System.out.println(fibonacci(1)); // Output: 1
    //     // System.out.println(fibonacci(5)); // Output: 5
    //     // System.out.println(fibonacci(9));

    //     // String s = fun("",1);
    //     // System.out.println(s);

    //     // int result = calculate(8);
    //     // System.out.println(result);
    //     // int result2 = calculate(5);
    //     // System.out.println(result2);

    }

    // // TASK 1
    // public static int factorial(int factorial_num) {
    //     if (factorial_num == 0 || factorial_num == 1) {
    //         return 1;
    //     }
    //     return factorial_num * factorial(factorial_num - 1);
    // }



    // // TASK 2
    // public static int power(int base, int exponent) {
    //     if (exponent == 0) {
    //         return 1;
    //     }
    //     return (base * power(base, exponent - 1));
    // }



    // // TASK 3
    // public static void print_elements(int[] arr, int index) {
    //     if (index >= arr.length) {

    //         return; 
    //     }

    //     System.out.println(arr[index]); 
    //     print_elements(arr, index + 1); 
    // }



    // // TASK 4
    // public static int fibonacci(int n) {
    //     if (n == 0) {

    //         return 0; 
    //     } else if (n == 1) {

    //         return 1;
    //     } else {

    //         return fibonacci(n - 1) + fibonacci(n - 2);
    //     }
    // }



    // Tracing

    // public static String fun(String s, int n){
    //     if(s.length()==4){
    //         return n+s+n;
    //         } else if(n%2==0){
    //         System.out.println(s+n+n+3);
    //         return fun(s+n, n+3);
    //         } else {
    //         System.out.println(s+n+(n-1));
    //         return fun(s+n, n-1);
    //     }
    // }


    //     public static int calculate(int n) {
    //     if (n <= 0){
    //         return 4;
    //     }
    //     else if (n % 2 != 0){
    //         return n + calculate(n - 1);
    //     }
    //     else{
    //         return n * calculate(n - 2);
    //     }
    // }   




    // 	public static void main(String[] args){
    // 	int i = 1;
    // 	int [] a = {5,6,7,8,9};
    // 	while (i <= 5){
    //     	int j = a[i%a.length];
    //     	while (j > 1){
    //         	System.out.print(j--);
    //         	if (j == 2)
    //             	break;
    //     	}
    //         System.out.println("***");
    //     	++i;
    // 	}
    // 	double x = 7;
    // 	double y = 8;
    // 	double z = 9;
    // 	System.out.println(x < y || y > z);
    // 	System.out.println(x < y && y > z);
    // 	System.out.println(x < y);
    // 	System.out.println(x + y < z);
    // 	System.out.println((x + y)-6 < z);
	// }







}
