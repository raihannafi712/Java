//Assignment Task (must Submit)
// Complete the rangeSum method
public class Task4 {

    //===================================TASK#4======================
    public static Integer rangeSum(BSTNode root, Integer low, Integer high){

        if (root == null) {
            return 0;
        }

        Integer total = 0;

        if (low <= root.elem && high >= root.elem) {            /// Element is >= low AND <= high. It's in range, so we take it and check both sides.
            
            total += root.elem;

            total += rangeSum(root.left, low, high);
            total += rangeSum(root.right, low, high);

        } else if (low < root.elem) {                             // Node is greater than high. It's too big, so we only search the left subtree.
            
            total += rangeSum(root.left, low, high);

        }else {                                                     // Node is smaller than low. It's too small, so we only search the right subtree.
            total += rangeSum(root.right, low, high);               
        }

        return total;
    }

    //===============================================================


}