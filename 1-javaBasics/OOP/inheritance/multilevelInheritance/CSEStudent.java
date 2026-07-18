package OOP.inheritance.multilevelInheritance;

public class CSEStudent extends Student {   /* Parent class */
    public int numLab;

    // public CSEStudent(String nm , int i , int lab){
    //     super(nm , i);
    //     numLab = lab;
    // }

    // public void cry(){
    //     System.out.println(name + " is crying because of lab- " + numLab);
    // }



    // LOCAL VS THIS VS SUPER VARIABLES

    public int y = 20;


    // method 1

    // public void method1(){
    //     int y = 45;

    //     System.out.println(y);          /* local > own instance > parent instance */
    //     System.out.println(this.y);     /* Own instance > Parent instance */
    //     System.out.println(super.y);    /* Parent instance */
    // }





    // method 2

    // public  int x = 20;

    // public void method2(){
    //     // int x = 45;

    //     System.out.println(x);              /* local > own instance > parent instance / Static */
    //     System.out.println(this.x);         /* Own instance > Parent instance / Static */
    //     System.out.println(super.x);        /* Parent instance / static */
    //     System.out.println(Student.x);      /* Parent static */
    //     System.out.println(CSEStudent.x);   /* Own static > Parent static */

    //     // There might be red lines in vs code but its just because the variables arent in this class so its saying to call directly the parent rather than using this.x
    // }




    // method3()

    public int z = 25;

    public void method3(){          /* CSEFresher class will take this class's z because method3() cant access its child class */
        System.out.println(z);
        System.out.println(this.z);
    }



}
