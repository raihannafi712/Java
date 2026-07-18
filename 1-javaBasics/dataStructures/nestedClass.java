package dataStructures;

public class nestedClass {
    
    // Static nested class
    static class staticNested{          /* public static class staticNested can be used too but outside the scope of nestedClass, it will show error */
        int haha = 30;
    }



    // Inner Class
    class innerClass{
        int haha = 40;
    }


    // Local class
    class localInnerClass{
        void med1(){
            int haha = 40;
        }
    }

    // Anonymous inner class
}
