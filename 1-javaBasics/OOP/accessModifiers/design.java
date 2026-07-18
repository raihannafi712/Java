package OOP.accessModifiers;


public class design {           /* SAME CLASS */

    // Access Modifiers cannot have same variable names
    public String name;         /* public keyword */
    String id;                  /* Default keyword */
    private int age;            /* Private keyword */  /* only design class can access it */
    protected double cgpa;      /* Protected keyword */
    public static int teamRun = 23;  /* Static variable */   /* It can be accessed without an object */
    public static int x = 230;


    public design(String nm , String i){
        name = nm;
        id = i;
    }

    public void updatePrivate(int i ){
        age = i;
    }

    public void showDetail(){
        System.out.println("Name: " + name);
        System.out.println("ID " + id);
        System.out.println("Age " + age);
        System.out.println("CGPA " + cgpa);
    }







    // Private methods

    private void privateMethod1(){
        System.out.println("Private method");
    }

    public void privateCaller(){    /* To call the private method outside the class */
        privateMethod1();
    }



    // Static variable

    public void staticLocal(){
        int x = 100;
        design.x = 300;

        System.out.println("Local variable" + x);
        System.out.println("Static variable" + design.x);
    }



    // static methods
    
    public static void staticMethod(){
        System.out.println("this is a static method");
    }
}
