//Before starting to work on this design the Tree in the Tester code 
// Complete the lowestCommonAncestor method

import org.w3c.dom.Node;

public class Task1 {

    //======================TASK#1a======================
    // This method takes only 1 parameter; root of a BST
    // You'll need to find the max of the BST and return it
    public static Integer maxOfBST( BSTNode root ){

        if (root == null) {
            return 0;
        }
        
        maxOfBST(root.right);

        return (Integer) root.elem;
    }

    //OR

//     Node maxOfBST(Node node) {
//     while (node.right != null) {
//         node = node.right;
//     }
//     return node;
// }
    //==================================================

    //======================TASK#1b======================
    // This method takes only 2 parameters
    // root of a BST and the value of which you wanna the predecessor
    // You'll need to find the max of the BST and return it
    public static Integer inOrderPred( BSTNode root, Integer x ){
        // TO DO
        return null; //remove this line
    }
    //==================================================
}
