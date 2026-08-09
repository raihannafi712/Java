
public class intro {

    public class TreeNode {
    public Object elem;
    public TreeNode left;
    public TreeNode right;

        // Constructor with one parameter
        public TreeNode(Object elem) {
            this.elem = elem;
            this.left = null;
            this.right = null;
        }
    }


    public static void main(String[] args) {
        // 1. Create the 6 objects
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(70);
        TreeNode n4 = new TreeNode(40);
        TreeNode n5 = new TreeNode(60);
        TreeNode n6 = new TreeNode(50);

        // 2. Connect the nodes
        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.right = n6;

        // 3. Executing the test lines
        
        System.out.println("--- Test 1 ---");
        System.out.println(n1.left); 
        // Prints a memory reference string (e.g., TreeNode@15db9742)

        System.out.println("\n--- Test 2 ---");
        System.out.println(n3.right.elem); 
        // Prints 50

        System.out.println("\n--- Test 3 ---");
        TreeNode x = n2.left;
        // Since elem is an Object in Java, we have to cast it to Integer to do math
        System.out.println((Integer) n1.elem + (Integer) x.elem); 
        // Note: The prompt table has a typo for Java here (n1.elem + x.elem), 
        // but the Python side says (x.elem + n6.elem). 
        // Let's do exactly what the Java side of the table asks:
        // System.out.println( n1.elem + x.elem ); // Compile error without casting.
        // Casted version:
        System.out.println((Integer) n1.elem + (Integer) x.elem); // 10 + 40 = 50

        System.out.println("\n--- Test 4 ---");
        x = new TreeNode(80);
        n3.left = x;
        System.out.println(n1.right.left.elem); 
        // Prints 80

        System.out.println("\n--- Test 5 ---");
        /* 
         ORIGINAL CODE: System.out.println(n1.left.right + n5.left);
         WHY IT ERRORS: This causes a COMPILE TIME ERROR. 
         In Java, the '+' operator cannot add two objects together unless one of them is a String.
         FIX: Convert them to strings or safely extract their integer elements. 
        */
        // Here is a fixed version that turns them into strings:
        System.out.println(String.valueOf(n1.left.right) + " and " + String.valueOf(n5.left));

        System.out.println("\n--- Test 6 ---");
        /*
         ORIGINAL CODE:
         n1.left.right = null;
         System.out.println(n1.left.right.elem);
         WHY IT ERRORS: This causes a RUNTIME ERROR (NullPointerException). 
         You cannot access '.elem' on a null object.
         FIX: Add a null check!
        */
        n1.left.right = null;
        if (n1.left.right != null) {
            System.out.println(n1.left.right.elem);
        } else {
            System.out.println("Fixed output: n1.left.right is null, cannot access elem.");
        }
    }
}
