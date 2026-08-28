public class Task1 {

    //======================TASK#1a======================
    public static Integer maxOfBST(BSTNode root) {
        if (root == null) {
            return null;
        }

        while (root.right != null) {
            root = root.right;
        }

        return root.elem;
    }
    //==================================================

    //======================TASK#1b======================
    public static Integer inOrderPred(BSTNode root, Integer x) {
        if (root == null || x == null) {
            return null;
        }

        BSTNode current = root;
        Integer predecessor = null;

        while (current != null) {
            if (x.equals(current.elem)) {
                if (current.left != null) {
                    return maxOfBST(current.left);
                }

                return predecessor;
            } else if (x < current.elem) {
                current = current.left;
            } else {
                predecessor = current.elem;
                current = current.right;
            }
        }

        return null;
    }
    //==================================================
}