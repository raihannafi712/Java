public class lab_5_1{
    class BTNode {
        Object elem;
        BTNode left, right;

        public BTNode(Object elem) {
            this.elem = elem;
        }
    }







    // TASK 6
    public static int subtractSummation(BTNode root){
        if(root==null){

            return 0;
        }
        int left_m= newm(root.left);
        int right_m=newm(root.right);
        int x=left_m-right_m;
        return x;
    }

    private static int newm(BTNode node){
        if(node==null){

            return 0;
        }
        int insert_val =(int)node.elem;
        int insert_y=insert_val +newm(node.left)+newm(node.right);
        return insert_y;
    }




    // TASK 7
    public static int levelSum(BTNode root){
        return newm(root,0);
    }

    private static int newm(BTNode root, int lvl){  
        if(root==null){

            return 0;
        }
        int main_val=(int)root.elem;
        if(lvl%2==1){
            int x=main_val+newm(root.left,lvl+1)+newm(root.right,lvl+1);
            return x;
        }
        else{
            int y=-main_val+newm(root.left,lvl+1)+newm(root.right,lvl+1);
            return y;
        }
    }




    // TASK 8
    public static void swapChild(BTNode root, int lvl, int M){
        if(root==null){

            return;
        }
        if(lvl >= M){

            BTNode x=root.left;
            root.left=root.right;
            root.right=x;
        }
        lvl+=1;
        swapChild(root.left,lvl,M);
        swapChild(root.right,lvl,M);
    }
}