//LAB TASK NO NEED TO SUBMIT
public class Task5 {

    //===================================TASK#5===================================
    // This method takes 1 parameter, the root
    // This method returns the largest value
    // No Helper Methods are needed for this task
    public static Integer maxTree( BTNode root ){
        if (root == null) {
            return null; 
        }
        
        Integer max = (Integer) root.elem;
        Integer leftMax = maxTree(root.left);
        Integer rightMax = maxTree(root.right);
        
        if (leftMax != null && leftMax > max) {
            max = leftMax;
        }
        
        if (rightMax != null && rightMax > max) {
            max = rightMax;
        }
        
        return max;
    }
    //============================================================================

}
