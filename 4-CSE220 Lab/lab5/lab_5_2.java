public class lab_5_2{
    class BSTNode {
        Integer elem;
        BSTNode left, right;

        public BSTNode(Integer elem) {
            this.elem = elem;
        }
    }


    // TASK 4
    public static Integer rangeSum(BSTNode root, Integer low, Integer high){
        if(root==null){

            return 0;
        }
        int x=0;
        if(root.elem>=low && root.elem<=high){

            x+=root.elem;
            x+=rangeSum(root.left,low,high);
            x+=rangeSum(root.right,low,high);
        }
        else if(root.elem<low){

            x+=rangeSum(root.right,low,high);
        }
        else{

            x+=rangeSum(root.left,low,high);
        }
        return x;
    }





    // TASK 5
    public static Integer mirrorSum(BSTNode root){
        if(root==null){

            return 0;}
            return m(root.left,root.right);
        }

        private static Integer m(BSTNode l, BSTNode r){

        if(l==null){

            return 0;
        }
        if(r==null){

            return 0;
        }
        int partial_x=l.elem+r.elem;
        partial_x+=m(l.right,r.left);
        partial_x+=m(l.left,r.right);
        return x;
    }




    // TASK 6
    public static Boolean isBST(BSTNode root){

        return newm(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static Boolean newm(BSTNode root, int min, int max){
        if(root==null){

            return true;
        }
        int main_val =(int)root.elem;
        if(main_val <=min){

            return false;
        }
        if(main_val >=max){

            return false;
        }
        Boolean l=newm(root.left,min,root.elem);
        Boolean r=newm(root.right,root.elem,max);

        return l&&r;
    }
}