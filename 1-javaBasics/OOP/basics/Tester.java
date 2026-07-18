package OOP.basics;

public class Tester {
    
    public static void main(String[] args) {
        
        // className variable = new className();   /* Object strcuture */
        Design s1 = new Design();                   /* Object 1 / Instance 1 */
        Design s2 = new Design();                   /* Object 2 */
        // Design s3;                               /* Object 3 has been declared */
        // s3 = new Design();                       /* Object 3 has been initialized */
        // Design h1 = new Design();                /* Object 4 */
        // Design c1 = new Design();                /* Object 6 */
        // Design k1 = new Design();                /* Object 7 */




        // To access memory location
        System.out.println(s1); 
        System.out.println(s2);  




        // To access instance variable
        s1.name="Haaland";                /* this value is assigned for s1 object's location's name instance variable only */
        s1.id= 10;
        s2.name = "Mbappe";               /* this value is assigned for s2 object's location's name instance variable only */
        s1.id= 10;
        s2.id = 200;




        // To print object
        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s2.name);
        System.out.println(s1.id);    /* The default value will be shown if not given */






        // // Memory referencing

        // System.out.println("Before referencing:" + " s1: " + s1.name + " s2: " + s2.name );

        // s1 = s2;  /* Memory referencing happened and s1 took s2's memory location */
        // System.out.println("After referencing:" + " s1: " + s1.name  + " s2: " + s2.name );

        // s1.name = "Vinijr";     /* s1 and s2 now belong to the same location (s2's) and changing the name variable will change both */
        // System.out.println("After editing s1 :" + s1.name + " " + s2.name );





        // // Instance Method 
        // s3.m1();
        // s3.m2(69 , "haha");
        // s3.studentInfo();

        // h1.doors = 10;
        // h1.window = 20;
        // // System.out.println(h1.viewHouse()); /* viewHouse() is void method which means it does not return any value and therefore you can not put it inside System.out.println() or you can not assign it to some variable. */
        // System.out.println("Before increasing = ");
        // h1.viewHouse();

        // h1.increaseDoors(20);
        // System.out.println("After increasing = ");
        // h1.viewHouse();






        // Instance and local variables
        // c1.color = "Red";
        // c1.action = "Running";
        // c1.catDetails();
        // c1.changAction("Sitting");
        // c1.catDetails();                  /* changed instance variable */
        





        // // return type

        // // Case 1
        // k1.add1(4, 5);

        // // Case 2
        // // System.out.println(k1.add1(4, 5));   /* This won't work because add1() needs to return a value */
        // int ans = k1.add2(4, 5);
        // System.out.println(ans);

        // // Case 3
        // System.out.println(k1.add2(4, 5));




        

        // // Method overloading

        // k1.joey();
        // k1.joey(69);
        // k1.joey("bread");
        // k1.joey("chicekns" , 6);
        // k1.joey("bread" , "meat");
        // k1.joey(4.00 , 6);          /* IMPORTANT */






        // Constructor

        // Design kk = new Design();  
        // Design jj = new Design("messi", 56);


        // Constructor overlaoding

        // Design hk = new Design("Ronaldo", 7);
        // Design kh = new Design("Benzema", 9, 14.5);












        // Pass-by reference

        // Design s1 = new Design("Bob", 11);             /* s1 object's datatype is Design */
        // Design s2 = new Design("Carol", 33);           /* s2 object's datatype is Design */

        
        // System.out.println("Directly accessing s2 object's location: " + s2);
        // s1.makeCall(s2);                                    /* It is called pass by reference */
        
        // s1.showDetails();
        // s2.showDetails();







        // Static variable

        // System.out.println("Static variable: " + Design.teamRun);
        // s1.staticLocal();





        // static method

        // Design.staticMethod();













        
        // Encapsulaton

        // s1.updateId(45);
        // System.out.println("Private variable: " + s1.showId());
    }   
}
