//Assignment Task (must Submit)
// Complete the rangeSum method
public class Task4 {

    //===================================TASK#4======================
    public static Integer rangeSum(BSTNode root, Integer low, Integer high){
        if(root==null){

            return 0;
        }

        int val = (int) root.elem;   
        int temp_val= 0;

        if(val >= low && val <= high){

            temp_val += val;

            temp_val+=rangeSum(root.left,low,high);
            temp_val+=rangeSum(root.right,low,high);

        }
        else if(val<low){

            temp_val += rangeSum(root.right,low,high);
        }
        else{

            temp_val += rangeSum(root.left,low,high);
        }
        return temp_val;
    }

    //===============================================================


}