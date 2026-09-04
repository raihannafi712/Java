public class BT {
    static class Node{
        int elem;
        Node left;
        Node right;

        public Node(int val){
            this.elem = val;
        }
    }


    // In BT, if we go for recursion, always set the base case root == null (recursion does not need temp variable for the root)
    //If we go for loops, assign a temp/current variable as the root. So the root's value stays the same
    
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
        System.out.println();




        //Insertion
        //In BT, we have to traverse level order and insert the new node at the first available empty position
        //As it will left to right, it will maintain a complete BT
        insert(root, 100);
        display(root);




        //search
        System.out.println(search(root, 100));
        














    }








    //METHODS



    //Insertion
    public static void insert(Node root, int val){
        root = insHelper(root, val);                            //Basically we need the helper to insert and for the recursion it will eventually return the same root always
    }

    //Helper 1
    public static Node insHelper(Node root, int val){
        if (root == null) {
            return root = new Node(val);
        }

        if (totalNode(root.left) <= totalNode(root.right)) {            //We insert into left subtree if it has lesser nodes than the right subtree

            root.left = insHelper(root.left, val);

        } else {
            root.right = insHelper(root.right, val);
        }
        return root;
    }


    //Helper 2
    public static int totalNode(Node root){
        if (root == null) {
            return 0;
        }

        return 1 + totalNode(root.left) + totalNode(root.right);
    }










    //Search (doing it with pre order trav)
    public static boolean search(Node root , int val ){ 
        if (root == null) {
            return false;
        }

        if (root.elem == val) {
            return true;
        }

        return search(root.left, val) || search(root.right, val);
    }














    //Traversals

    //Pre-Order (w > L > R)
    public static void preOrder(Node root ){ 
        if (root == null) {
            return;
        }

        System.out.print(root.elem + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    //Post-order (L -> R -> W)
    public static void postOrderLvl(Node root ){
        helperPost(root, 0);
    }

    private static void helperPost(Node root , int lvl){
        if (root == null) {
            return;
        }

        helperPost(root.left, lvl + 1);                                  //Going down each edge adds 1 level
        helperPost(root.right, lvl + 1);  
        System.out.println(root.elem + ": " + lvl);
    }



    //In-order traversal (L -> W -> R)
    public static void inOrderEvenLvl(Node root ){
        helperIn(root, 0);
    }

    private static void helperIn(Node root , int lvl){
        if (root == null) {
            return;
        }

        helperIn(root.left, lvl + 1);                                  //Going down each edge adds 1 level
        System.out.println(root.elem + ": " + lvl);
        helperIn(root.right, lvl + 1);  
        
    }



    //Level- order traversal















    //There are 3 ways to traverse through a BT.These 3 ways are enough to solve any BT problem and searching (CHECK NOTE)
    // DISPLAY  (Pre-order)
    public static void display(Node root){
        if (root == null) {                     // BASE CASE FOR THE RECURSION
            return;
        }

        System.out.print(root.elem + " ");
        display(root.left);
        display(root.right);
    }



}