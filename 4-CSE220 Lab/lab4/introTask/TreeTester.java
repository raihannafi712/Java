
public class TreeTester {
    
    public static void main(String[] args) {
        
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(20);
        TreeNode n3 = new TreeNode(70);
        TreeNode n4 = new TreeNode(40);
        TreeNode n5 = new TreeNode(60);
        TreeNode n6 = new TreeNode(50);

        n2.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = null;
        n3.right = n6;


        //Outputs
        System.out.println(n1.left);    //n2

        System.out.println( n3.right.elem );    //50

        TreeNode x = n2.left;   //x = n4
        System.out.println( n1.elem + x.elem ); // 50

        x = new TreeNode(80);
        n3.left = x;    // n3.left = 80
        System.out.println(n1.right.left.elem); //80

        // System.out.println(n1.left.right + n5.left);

        n1.left.right = null; //n5 = null
        // System.out.println(n1.left.right.elem) 


    }
}
