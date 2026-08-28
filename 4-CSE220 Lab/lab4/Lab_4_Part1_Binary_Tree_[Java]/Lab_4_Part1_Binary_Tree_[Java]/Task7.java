// Complete the levelSum method
//ASSIGNMENT TASK MUST SUBMIT

// import org.w3c.dom.Node;

public class Task7 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    // public static Integer levelSum( BTNode root ){
    //     //TO DO
    //     return null; //remove this line once ready
    // }


    public static int levelSum(BTNode root) {           /* IMPORTANT */

        return level_sum_odd(root, 0) - level_sum_even(root, 0);            /* Took 2 separate helpers to get the sums of odd and even */
    }



    private static int level_sum_odd(BTNode root, int lvl){
        if (root == null) {
            return 0;
        }

        int child_sum = level_sum_odd(root.left, lvl + 1) + level_sum_odd(root.right, lvl + 1);

        if (lvl % 2 != 0) {
            return (int) root.elem + child_sum;
        } 

        return child_sum;

    }

    private static int level_sum_even(BTNode root, int lvl){
        if (root == null) {
            return 0;
        }

        int child_sum = level_sum_even(root.left, lvl + 1) + level_sum_even(root.right, lvl + 1);

        if (lvl % 2 == 0) {
            return (int) root.elem + child_sum;
        } 

        return child_sum;
    }































    // private static int lvl_sum_helper(BTNode node, int level) {

    //     if (node == null) {

    //         return 0;
    //     }

    //     int main_val = (Integer) node.elem;
    //     int curr_val ;

    //     if (level % 2 == 0) {

    //         curr_val = -main_val;
    //     } else {
            
    //         curr_val = main_val;
    //     }


    //     return curr_val + lvl_sum_helper(node.left, level + 1) + lvl_sum_helper(node.right, level + 1);
    // }
    //============================================================================





}
