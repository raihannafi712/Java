public class BST {
    
    static class Node{
        int elem;
        Node left;
        Node right;

        public Node(int item){
            elem = item;
            left = right = null;
        }
    }

    Node root;

    //Insertion
     public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node current, int key) {
        if (current == null) {
            return new Node(key);
        }
        if (key < current.elem) {
            current.left = insertRec(current.left, key);
        } else if (key > current.elem) {
            current.right = insertRec(current.right, key);
        }
        return current;
    }







    // SEARCH
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.elem == key) {              //if root is that value
            return true;
        }

        if (key > root.elem ) {
            return searchRec(root.right, key);   

        } else {
            return searchRec(root.left, key);
        }

    }







    // FIND MINIMUM
    public int findMin(Node current) {
        while (current.left != null) {
            current = current.left;
        }
        return current.elem;

        //Or recursion
    }










    // FIND MAXIMUM
    public int findMax(Node current) {
        while (current.right != null) {
            current = current.right;
        }
        return current.elem;
    }







    //  DELETION            (Basically if its a  leaf node then it just vanishes and if it has children then in-order trav wise successor(right subtree's smallest one))
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key > root.elem ) {

            root.right = deleteRec(root.right, key);            
        } else if (key < root.elem) {

            root.left = deleteRec(root.left, key);

        }else{                                               //this else means we have found the value

            //Case 1 and 2
            // If both left and right are null then null will be returned and it will replace root.left when its upper node called 

            if (root.left == null) {

                return root.right;                          //If that node has only right child then that right child will be its successor
            }else if (root.right == null) {
                
                return root.left;                           //If that node has only left child then left right child will be its successor         
            }


            //Case 3
            //This part means the node has 2 children


            // Copy the in-order successor's value (smallest in right subtree)
            root.elem = findMin(root.right);                //It's right subtree's smallest value will replace it

            //Delete the in-order successor
            root.right = deleteRec(root.right,root.elem);   //It will traverse to that duplicate value and return null here
        }
        return root;

    }












    // 6. IN-ORDER TRAVERSAL (Left, Root, Right)
    public void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.elem + " ");
            inOrder(current.right);
        }
    }

    // 7. PRE-ORDER TRAVERSAL (Root, Left, Right)
    public void preOrder(Node current) {
        if (current != null) {
            System.out.print(current.elem + " ");
            preOrder(current.left);
            preOrder(current.right);
        }
    }

    // 8. POST-ORDER TRAVERSAL (Left, Right, Root)
    public void postOrder(Node current) {
        if (current != null) {
            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.elem + " ");
        }
    }




    // Main method testing all operations
    public static void main(String[] args) {
        BST bst = new BST();

        // Insert elements from the sample tree
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        System.out.print("In-Order Traversal: ");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.print("Pre-Order Traversal: ");
        bst.preOrder(bst.root);
        System.out.println();

        System.out.print("Post-Order Traversal: ");
        bst.postOrder(bst.root);
        System.out.println();

        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 99: " + bst.search(99));

        System.out.println("Min Value: " + bst.findMin(bst.root));
        System.out.println("Max Value: " + bst.findMax(bst.root));

        System.out.println("\nDeleting 20 (leaf)...");
        bst.delete(20);
        System.out.print("In-Order: ");
        bst.inOrder(bst.root);
        System.out.println();

        System.out.println("Deleting 30 (node with two children)...");
        bst.delete(30);
        System.out.print("In-Order: ");
        bst.inOrder(bst.root);
        System.out.println();
    }
}
