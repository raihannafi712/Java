package oldLab.lab7;
// import java.util.Scanner;

// public class lab {
//     /* TASK 10 */

//     // int hungry;         /* Valid */
//         // int 2AB;        /* Invalid name.(Variable name can not start with a digit) */
//         // int 312.2;       /*Invalid. (Variable name can not start with a floating-point number)  */
//         // int MOBILE;     /* Valid */
//         // int "Ans";      /* Invalid (Can not contain double quotations) */
//         // int $30;         /* Valid */
//         // int Yes/No;      /* Invalid.( Can not contain forward slash) */
//         // int student-id;     /* Invalid.(Can not contain hyphen) */
//         // int A+3;          /* Invalid.(Can not contain plus sign) */
//         // int 'S';        /* Invalid.(Can not contain single quotations) */
//         // int return;     /* Invalid. (return is a reserved keyword) */



//     /* TASK 11 */  

//     /* 2.1 */  
//         public static void main(String[] args) {
//             int h1 = 5;
//             System.out.println(h1);
//             /* 2.2 */
//             int h2 = 10;
//             System.out.println(h1 + h2);
//             /* 2.3 */
//             int h3 = 5;
//             int h4 = 5;
//             System.out.println(h3*h4);  /* product of two integers */
//             System.out.println(h3/h4);  /* division of two integers */

//             /* 2.4 */

//             double h5 = 12.5;
//             double h6 = 12.5;
//             System.out.println(h5 + h6);
//             System.out.println(h5*h6);
//             System.out.println(h5/h6);

//             /*2.5*/

//             int num1 = 5;
//             double num2 = 5;
            
//             System.out.println(num1 + num2);
//             System.out.println(num1 * num2);
//             System.out.println(num1 / num2);

//             /* 2.6 */

//             String hh1 = "hello";
//             String hh2 = "there";
//             int hh3 = 5;

//             System.out.println(hh1+hh2);    /* string + string */
//             System.out.println(hh1 + hh3);  /* string + integer */
//             System.out.println(hh3+hh1);   /* integer + string  */



//             /*  TASK 12 */

//             double r = 4.00;

//             System.out.println("Area="+ 3.1416*r*r);
//             System.out.println("Circumference"+ 2*3.1416*r);



//             /* TASK 13 */

//             Scanner input_int = new Scanner(System.in);
//             System.out.println("Enter any integer= ");
//             int zy = input_int.nextInt();

//             System.out.println("Last two digits of the integer are= "+ (zy%100));

//             input_int.close();



//             /* TASK 14 */

//             double inches = 1000.0;

//             System.out.println("1000 inches equals to "+inches*0.0254 + "meters");



//             /* TASK 15 */

//             /* By creating a third variable */

//             int x = 700;
//             int y = 8000;

//             System.out.println("before_swap");
//             System.out.println("x="+ x);
//             System.out.println("y="+ y);

//             int temp = x;
//             x=y;
//             y=temp;

//             System.out.println("After_swap");
//             System.out.println("x="+ x);
//             System.out.println("y="+ y);


//             /* without third variable */

//             int c = 100;
//             int d = 5000;

//             System.out.println("before_swap");
//             System.out.println("c="+c);
//             System.out.println("d="+d);

//             c = c + d;
//             d = c - d;
//             c = c - d;

//             System.out.println("after_swap");
//             System.out.println("c=" + c);
//             System.out.println("d=" + d);


//             /* TASK 16 */

            
//             Scanner total_input = new Scanner(System.in);
//             System.out.print("Enter mintues: ");
//             int total_mins = total_input.nextInt();

//             int total_days = ((total_mins/60)/24);
//             int total_years = (total_days/365);
//             int extra_days = (total_days % 365);

//             System.out.println(total_years + " years " + extra_days + " days");

//             total_input.close();

//             /* TASK 17 */

//             int a = 2;
//             int b = 5;
//             int c = 8;

//             System.out.println("d= "+ (((2*b)*(c-a)/3)+7));

//             /* TASK 18 */

//            Scanner ID = new Scanner(System.in);
//            System.out.print("Enter ID: ");
//            int ff = ID.nextInt();

//             int lastTwo = (ff % 100);

//             int lastDig = (lastTwo%10);
//             int lastSec = (lastTwo/10);

//             System.out.println(lastDig + "," + lastSec);

//             ID.close();


//             /* TASK 19 */

//             int a = 8;
//             int b = 3;

//             double singleSide = Math.sqrt((a/2)*(a/2)+(b*b));

//             double area = (3*Math.sqrt(3)/2)*(singleSide*singleSide);

//             System.out.println("Hexagon area= "+ area);
//             System.out.println("Perimeter= "+ (6*singleSide));

//             /* TASK 20 */

//             double a = 4.5;
//             double b = 9.5;

//             double c = Math.sqrt((a*a)+(b*b));

//             System.out.println("sinA= "+ (a/c));
//             System.out.println("sinB= "+ (b/c));
//             System.out.println("cosA= "+ (b/c));
//             System.out.println("cosB= "+ (a/c));


//         }

// }
