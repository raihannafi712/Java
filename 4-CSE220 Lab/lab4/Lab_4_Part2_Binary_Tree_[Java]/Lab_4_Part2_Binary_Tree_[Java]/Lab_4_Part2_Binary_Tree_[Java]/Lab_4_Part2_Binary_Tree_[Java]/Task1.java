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
    public static Integer inOrderPred(Node root, int value) {
        Node predecessor = null;
        Node current = root;

        while (current != null) {
            if (value > current.value) {
                // The target value is greater, so current might be the predecessor.
                // Record it, and move right to find an even closer (larger) predecessor.
                predecessor = current;
                current = current.right;
                
            } else if (value < current.value) {
                // The target value is smaller, predecessor must be in the left subtree.
                current = current.left;
                
            } else {
                // We found the target node!
                if (current.left != null) {
                    // Case 1: Node has a left subtree. 
                    // Reusing 1a's logic: Find the maximum in the left subtree.
                    Node temp = current.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    predecessor = temp;
                }
                
                // Case 2: Node has no left subtree. 
                // The predecessor is the last recorded ancestor where we took a right turn.
                break; 
            }
        }

        // Return the value if a predecessor exists, otherwise return null
        return (predecessor != null) ? predecessor.value : null;
    }




    //==================================================
}
