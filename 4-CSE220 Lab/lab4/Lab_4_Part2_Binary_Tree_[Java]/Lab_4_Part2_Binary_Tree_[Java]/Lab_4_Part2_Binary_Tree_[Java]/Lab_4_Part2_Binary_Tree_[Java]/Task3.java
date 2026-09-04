//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method
public class Task3 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){

        BSTNode current = root;
        String s1 = new String();
        
        while (current != null) {               //We need loop because recursion would create the string over and over again

            s1 += current.elem + " ";           //Add the nodes only when they help reach the key
            
            if (key < current.elem) {           //If the key is on the left then left node will become current and also be added to the string
                
                current = current.left;

            } else if (key > current.elem) {
                
                current = current.right;

            } else{                             //Reached the key and now return the string
                return s1;
            }
        }
        return "No Path Found";                 //Key does to exist in the tree
    }
    //============================================================================

}
