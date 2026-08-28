/*
 * Given the root of a binary tree, return the max of all nodes.
 *
 * Sample tree:
 *              10
 *            /    \
 *          30      20
 *         /  \    /  \
 *       50   90  70   80
 *                    /  \
 *                  30    40
 *
 * Sample returned value: 90
 *
 * Both versions below use the same recursive pattern:
 *   1. Recurse into the left subtree.
 *   2. Recurse into the right subtree.
 *   3. Compare this node's own value against both results.
 *   4. Return the largest of the three.
 *
 * They only differ in what the base case (empty subtree) returns.
 */

public class BinaryTreeMax {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    // Alternate node shape matching the "BTNode" style used in the second version below.
    static class BTNode {
        Object elem;
        BTNode left, right;
        BTNode(int elem) { this.elem = elem; }
    }

    // =====================================================================
    // Version 1 — sentinel base case (Integer.MIN_VALUE)
    // =====================================================================
    // Works correctly for ANY tree, including ones with negative values,
    // because MIN_VALUE can never accidentally win a comparison.
    public static int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        int max = root.val;
        if (leftMax > max) max = leftMax;
        if (rightMax > max) max = rightMax;
        return max;
    }

    // =====================================================================
    // Version 2 — zero base case (as originally submitted)
    // =====================================================================
    // Same shape, but the base case returns 0 instead of a true sentinel.
    // Correct for THIS sample tree since every value is positive, but if
    // the tree contained only negative numbers, every leaf's max would be
    // compared against 0 and the function would wrongly report 0.
    public static Integer maxTree(BTNode root) {
        if (root == null) {
            return 0;
        }

        Integer left_node = maxTree(root.left);
        Integer right_node = maxTree(root.right);

        Integer max = (Integer) root.elem;

        if ((Integer) left_node > max) {
            max = left_node;
        }
        if ((Integer) right_node > max) {
            max = right_node;
        }

        return max;
    }

    // =====================================================================
    // Demo / driver
    // =====================================================================
    private static TreeNode buildSampleTree() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(30);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(90);
        root.right.left = new TreeNode(70);
        root.right.right = new TreeNode(80);
        root.right.right.left = new TreeNode(30);
        root.right.right.right = new TreeNode(40);
        return root;
    }

    private static BTNode buildSampleBTTree() {
        BTNode root = new BTNode(10);
        root.left = new BTNode(30);
        root.right = new BTNode(20);
        root.left.left = new BTNode(50);
        root.left.right = new BTNode(90);
        root.right.left = new BTNode(70);
        root.right.right = new BTNode(80);
        root.right.right.left = new BTNode(30);
        root.right.right.right = new BTNode(40);
        return root;
    }

    public static void main(String[] args) {
        System.out.println("findMax(sample tree) = " + findMax(buildSampleTree()));
        System.out.println("maxTree(sample tree) = " + maxTree(buildSampleBTTree()));
    }
}
