//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST(BSTNode root){

        return isBST_helpter(root, null, null);
    }

    private static Boolean isBST_helpter(BSTNode root, Integer min, Integer max){
        if(root==null){

            return true;
        }

        int main_val =(int)root.elem;

        if(min != null && main_val <= min){

            return false;
        }
        if(max != null && main_val >= max){

            return false;
        }

        Boolean left = isBST_helpter(root.left,min,root.elem);
        Boolean right=isBST_helpter(root.right,root.elem,max);

        return left && right;
    }
    //===============================================================


}
