package newLab;

public class lab8 {

    // Lab tasks

    public static void main(String[] args) {
        // evenChecker(17);

        // boolean result = isEven(10);
        // System.out.println( result );

        // boolean result = isPos(-5);
        // System.out.println( result );

        // sequence(10);
        // sequence(-7);

        // double area = circleArea(5);
        // System.out.println(area);

        // double volume = sphereVolume(5.0);
        // System.out.println(volume);

        // findSpace(10,"circle"); 
        // findSpace(5,"sphere"); 

        // boolean res = isTriangle(7,5,10);
        // System.out.println( res );
        // boolean res = isTriangle(3,2,1);
        // System.out.println( res );

        // triArea(3,2,1);
        // triArea(7,5,10);

        // boolean check = isPrime(7);
        // System.out.println(check);

        // boolean check = isPerfect(6);
        // System.out.println(check);
        // boolean check2 = isPerfect(33);
        // System.out.println(check2);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Num:");
        // int n = sc.nextInt();

        // int result = special_sum(n);
        // System.out.println(result);

        // showDots(5); 
        // showDots(3); 

        // show_palindrome(5); 
        // show_palindrome(3);


        // showDiamond(N);

        // double t = calcTax(16,20000);
        // System.out.println(t);

        // calcYearlyTax();



    }



     // TASK 1

    // //  A
    // public static void evenChecker(int n){
    // if (n % 2 == 0) {
    //     System.out.println("Even!!");
    // } else {
    //     System.out.println("Odd!!");
    // }
    // }


    // // B
    // public static boolean isEven(int n){
    //     if (n % 2 == 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    
    // // C
    // public static boolean isPos(int n){
    //     if (n > 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }



    // // D
    // public static void sequence(int n){
    //     if (n > 0) {
            
    //         for (int i = 0; i <= n ; i++) {
    //             if (i % 2 == 0) {
    //                 System.out.print(i + " ");
    //             }
    //         }

    //     } else {
    //         for (int i = n; i <= -1 ; i++) {
    //             if (i % 2 != 0) {
    //                 System.out.print(i + " ");
    //             }
    //         }
    //     }
    // }





    // TASK 2

    // // A
    // public static double circleArea(int n){
    //     double area = (Math.PI * (n*n));
    //     return area;
    // }


    // // B
    // public static double sphereVolume(double n){
    //     double vol = ((4.0/3.0) * Math.PI * (n*n*n));
    //     return vol;
    // }


    // // C            !important
    // public static void findSpace(int n , String name){
    //     if (name.equals("circle")) {
    //         int r = n/2;
    //         System.out.println(circleArea(r));

    //     } else if (name.equals("sphere")) {
    //         double r = n/2.0;
    //         System.out.println(sphereVolume(r));

    //     }else {
    //         System.out.println("Wrong parameter");
    //     }
    // }






    // TASK 3

    // // A
    // public static boolean isTriangle(int a , int b , int c){
    //     if (a+b > c && b+c > a && c+a > b) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }


    // // B
    // public static void triArea(int a , int b , int c){
    //     if (isTriangle(a, b, c) == true) {
            
    //         double s = (a+b+c)/2.0;
    //         double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

    //         System.out.println(area);
    //     } else {
    //         System.out.println("Can’t form triangle");
    //     }
    // }










    // Home tasks

    // TASK 1

    // // A
    // public static boolean isPrime(int n){
    //     if (n >= 2) {
    //         for (int i = 2; i <= Math.sqrt(n); i++) {       /* Memorize */
    //             if (n % i == 0) {
    //                 return false;
    //             }
    //         }
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }




    // // B
    // public static boolean isPerfect(int n){
    //     int sum = 0;

    //     if (n >= 6) {
    //         for (int i = 1; i < n ; i++) {
    //             if (n % i == 0) {
    //                 sum += i;
    //             }
    //         }

    //         if (sum == n) {
    //             return true;
    //         } else {
    //             return false;
    //         }
    //     } else {
    //         return false;
    //     }
    // }



    // // C
    // public static int special_sum(int n){

    //     int sum = 0;
    //     for (int i = 1; i <= n; i++) {

    //         if (isPrime(i) == true) {
    //             sum += i;
    //         }

    //         if (isPerfect(i) == true) {
    //             sum += i;
    //         }
    //     }

    //     return sum;
    // }




    // TASK 2

//     // Task A: showDots method
//      public static void showDots(int num) {

//         for (int i = 0; i < num; i++) {

//             System.out.print(".");
//         }
//         System.out.println(); 
//     }






//     // Task B: show_palindrome method
//     public static void show_palindrome(int num) {

//         for (int i = 1; i <= num; i++) {

//             System.out.print(i);
//         }

//         for (int i = num - 1; i >= 1; i--) {

//             System.out.print(i);
//         }
//         System.out.println(); 
//     }






//       // Task C: showDiamond method

//     public static void showDiamond(int n) {
//         for (int i = 1; i <= n; i++) {
      
//         for (int j = 0; j < n - i; j++) {
//             System.out.print(".");
//         }
        
//         for (int j = 1; j <= i; j++) {
//             System.out.print(j);
//         }
        
//         for (int j = i - 1; j >= 1; j--) {

//             System.out.print(j);
//         }
        
       
//         for (int j = 0; j < n - i; j++) {

//             System.out.print(".");
//         }
        
//         System.out.println();
//     }
    
    
//         for (int i = n - 1; i >= 1; i--) {

    
//         for (int j = 0; j < n - i; j++) {
            
//             System.out.print(".");
//         }
        
       
//         for (int j = 1; j <= i; j++) {

//             System.out.print(j);
//         }
        
       
//         for (int j = i - 1; j >= 1; j--) {

//             System.out.print(j);
//         }
        
    
//         for (int j = 0; j < n - i; j++) {

//             System.out.print(".");
//         }
        
//         System.out.println();
//     }
//     }









    // TASK 3       

    // // A
    // public static double calcTax(int age, double salary) {
    //     if (age < 18) {
    //         return 0.0; 
    //     }
    //     if (salary < 10000) {
    //         return 0.0; 
    //     }
    //     if (salary <= 20000) {
    //         return salary * 0.07; 
    //     }
    //     return salary * 0.14; 
    // }



    // // B
    // public static void calcYearlyTax(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Age:");
    //     int age = sc.nextInt();
    //     double tax_sum = 0;

    //     if (age > 18) {
    //         for (int i = 1; i <= 12; i++) {
            
    //             int month = sc.nextInt();
    //             tax_sum += calcTax(age, month);

    //             System.out.println("Month" + i + " tax:" + calcTax(age, month));
    //         }
    //         System.out.println("Total yearly tax: " + tax_sum);
    //     } else {
    //         System.out.println("No tax");
    //     }

    // 

}


