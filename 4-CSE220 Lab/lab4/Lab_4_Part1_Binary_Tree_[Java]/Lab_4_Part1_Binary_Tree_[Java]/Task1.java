//LAB TASK NO NEED TO SUBMIT
public class Task1 {

    //======================TASK#1_1======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree pre-order
    public static void preOrder( BTNode root ){ //w > L > R
        if (root == null) {
            return;
        }

        System.out.print(root.elem + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //==================================================

    //======================TASK#1_2======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void postOrderLvl( BTNode root ){
        helperPost(root, 0);
    }

    private static void helperPost(BTNode root , int lvl){
        if (root == null) {
            return;
        }

        helperPost(root.left, lvl + 1);                                  //Going down each edge adds 1 level
        helperPost(root.right, lvl + 1);  
        System.out.println(root.elem + ": " + lvl);
    }

    //==================================================

    //======================TASK#1_3======================
    // This method takes only 1 parameter which is root
    // You'll traverse the tree in-order
    public static void inOrderEvenLvl( BTNode root ){
        helperIn(root, 0);
    }

    private static void helperIn(BTNode root , int lvl){
        if (root == null) {
            return;
        }

        helperIn(root.left, lvl + 1);                                  //Going down each edge adds 1 level
        if (lvl % 2 == 0) {
            System.out.println(root.elem + ": " + lvl);
        }
        helperIn(root.right, lvl + 1);  
        
    }

    //==================================================

}
