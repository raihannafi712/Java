//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum(BSTNode root){
        if(root==null){

            return 0;
        }

        return mirror_s_helper(root.left,root.right);
    }

    private static Integer mirror_s_helper(BSTNode left, BSTNode right){

        if(left==null){

            return 0;
        }
        if(right==null){

            return 0;
        }

        int partial_x = left.elem+right.elem;
        partial_x+=mirror_s_helper(left.right,right.left);
        partial_x+=mirror_s_helper(left.left,right.right);

        
        return partial_x;
    }
    //===============================================================


}
