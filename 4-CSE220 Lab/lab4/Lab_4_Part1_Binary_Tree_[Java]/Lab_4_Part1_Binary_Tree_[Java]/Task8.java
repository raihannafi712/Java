// Complete the swapChild method
//ASSIGNMENT TASK MUST SUBMIT

// import org.w3c.dom.Node;

public class Task8 {

    //===================================TASK#4===================================
    // This method takes only 3 parameters
    // 1st one is root of the given tree
    // 2nd one is there to help you count the levels
    // 3rd one is the level TILL whic you need to swap childs
    // All the changes will happen in-place
    // This method doesn't return anything
    // You can use extra helper private static methods as per need

    public static void swapChild(BTNode root, int lvl, int M){
        if (root == null) {
            return;
        }

        if (lvl < M) {
            
            BTNode temp = root.left;

            root.left = root.right;                 /* Now root.left and root.right both are root.right */
            root.right = temp;                      /* Now root.right is the saved root.left (They are swapped) */
        }

        lvl++;
        swapChild(root.left, lvl, M);
        swapChild(root.right, lvl, M);


    }
    //============================================================================
}