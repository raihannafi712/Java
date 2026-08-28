// Complete the subtractSummation method
public class Task6 {

    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    public static Integer subtractSummation(BTNode root) {

        Integer left_total = substractHelper(root.left);
        Integer right_total = substractHelper(root.right);

        return left_total - right_total;
    }

    private static Integer substractHelper(BTNode root){
        if (root == null) {
            return 0;
        }

        return (Integer) root.elem + substractHelper(root.left) + substractHelper(root.right);
    }
}