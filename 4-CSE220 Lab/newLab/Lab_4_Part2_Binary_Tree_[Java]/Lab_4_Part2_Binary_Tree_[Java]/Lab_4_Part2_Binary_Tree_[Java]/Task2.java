public class Task2 {

    //======================TASK#2======================
    // Finds the Lowest Common Ancestor (LCA) of nodes x and y in a BST
    public static Integer lowestCommonAncestor(BSTNode root, Integer x, Integer y) {
        if (root == null || x == null || y == null) {
            return null;
        }

        BSTNode current = root;

        while (current != null) {

            if (x < current.elem && y < current.elem) {
                current = current.left;
            }

            else if (x > current.elem && y > current.elem) {
                current = current.right;
            }

            else {
                return current.elem;
            }
        }

        return null;
    }
    //==================================================
}