import lab_2_part1.src.Node;

public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int val){
            this.data = val;
        }
    }

    


    public static void main(String[] args){
        Node root = new Node(2);

        Node a = new Node(4);
        Node b = new Node(18);
        root.left = a;
        root.right = b;

        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;

        Node e = new Node(11);
        b.right = e;

        display(root);                  //2 4 6 5 18 11 


    }








    //METHODS


    //There are 3 ways to traverse through a BT.These 3 ways are enough to solve any BT problem and searching (CHECK NOTE)
    // DISPLAY  (Pre-order)
    public static void display(Node root){
        if (root == null) {                     // BASE CASE FOR THE RECURSION
            return;
        }

        System.out.print(root.data + " ");
        display(root.left);
        display(root.right);
    }



}