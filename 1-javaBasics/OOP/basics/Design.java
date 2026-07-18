package OOP.basics;

public class Design {
    
    public String name;   /* Instance variable 1 */
    public int id = 100;  /* Instance variable 2 */
    public int window;    /* Instance variable 3 */
    public int doors;     /* Instance variable 4 */
    public String color;  /* Instance variable 5 */
    public String action; /* Instance variable 6 */
    public int result;    /* Instance variable 7 */
    public int k2;        /* Instance variable 8 */

    public static int x = 23;  /* Static variable */   /* It can be accessed without an object */
    private int age = 55;


    // This design's each and every object has its own separate location
    // instance variable , instance methods can not be called without an object
    // Each object with its own location, has its own instance variable values





    // Instance methods

    // public void m1(){
    //     System.out.println("Test method is working");
    // }

    // public void m2(int x , String f){
    //     System.out.println("Method's int = " + x + " and String = " + f);
    // }

    // public void studentInfo(){
    //     System.out.println("Student's information: ");
    //     System.out.println("Name: " + name);
    //     System.out.println("id: " + id);
    // }

    // public void viewHouse(){
    //     System.out.println("Windows = " + window);
    //     System.out.println("Doors = " + doors);
    // }

    // public void increaseDoors(int add){
    //      doors = doors + add;

    //     //  doors = instance variable
    //     //  add = local variable
    // }







    // //  Instance and local variable

    // public void catDetails(){
    //     System.out.println(color + " cat is " + action);

    // }

    // public void changAction(String action){
    //     this.action = action;

    //     // Left side's action is a local variable
    //     // Right side's variable is a instance variable
    //     // To access a instance variable, this keyword needs to be called
    // }










    // // Return type

    // public void add1(int x , int y){
    //     result = x + y;
    //     System.out.println(result);
    // }

    // public int add2(int x , int y){
    //     result = x + y;
    //     return result; /* only result's value will return from this method */
    // }















    // Method overloading    /* Making method of the same name but different parameters */

    // public void joey(){                                          /* 1 */
    //     System.out.println("Joey is eating pizza");
    // }

    // public void joey(int x){                                     /* 2 */
    //     System.out.println("Joey is eating " + x);
    // }

    // public void joey(String y){                                 /* 3 */
    //     System.out.println("Joey is eating " + y);
    // }

    // public void joey(String y , int x){                         /* 4 */    /* IMPORTANT */              
    //     System.out.println("Joey is eating " + y + " " + x);
    // }

    // public void joey(int x , String y){                         /* 5 */    /* IMPORTANT */
    //     System.out.println("Joey is eating " + y + " " + x);
    // }

    // public void joey(String x , String y){                      /* 6 */     /* IMPORTANT */
    //     System.out.println("Joey is eating " + x + " " + y);
    // }

    // public double joey(double x , int y){                       /* 7 */
    //     System.out.println(x + y);
    //     return x+y;                     /* this is how to return one value with two variables */
    // }


















    // Constructor

    // Everytime we create a new object, constructor gets called
    // In other words, To call a constructor, we have to create a NEW object each time
    // A method can be called multiple times by an object but a constructor can get called ONCE by one object
    // Constructor never returns anything
    // Constructors are 2 types. - Default / Non-parameterized , parameterized constructor



    // public Design(){                        /* Default constructor */
    //     System.out.println("fuck off");
    // }

    // public Design(String name , int id){    /* Parameterized constructor */
    //     System.out.println(name + id);
    // }














    // Constructor overloading

    // public Design(String name , int id){
    //     System.out.println(name + " "  + id);
    // }

    // public Design(String name , int id , double h){
    //     System.out.println(name + " " + id + " " + h);
    //     this.k2 = id;
    // }

    // public void k2(){
    //     System.out.println(k2);
    // }


















    // // Pass-by reference

    // public String studentName;
    // public int studentId;

    // public Design(String nm , int i){
    //     studentName = nm;
    //     studentId = id;
    // }

    // public void makeCall(Design x){                      /* We called s2,so makecall() needs to recieve x as Design datatype */
    //     System.out.println("I am " + studentName);
    //     System.out.println("By referencing, accessing s2 object's location:" +  x);
    //     System.out.println("By referencing, accessing s2 object's name value: " + x.studentName);
    // }

    // public void showDetails(){
    //     System.out.println("Name: " + studentName);
    //     System.out.println("ID "+ studentId);
    // }















    // Static variable

    // public void staticLocal(){
    //     int x = 100;
    //     Design.x = 300;

    //     System.out.println("Local variable" + x);
    //     System.out.println("Static variable" + Design.x);
    // }



    // // static methods
    
    // public static void staticMethod(){
    //     System.out.println("this is a static method");
    // }











    // Encapsulation

    // In setter method, we encapsulate the data taken from tester part and update the private variable. This is called encapsulation

    // public void updateId(int i){    /* Setter method */
    //     if (i > 0) {
    //         id = i;
    //     } else {
    //         System.out.println("Invalid Age");
    //     }
    // }

    // public int showId(){    /* Getter method */
    //     return id;
    // }





}
