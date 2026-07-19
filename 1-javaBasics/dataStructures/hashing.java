import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;



public class hashing {


    public static class Node{           /* Static nested class */   /* Basically design class */

        Object data;                    //value                     /* This is used to print in the tester class. Ex- head.data (where head is a variable of Node data type) */
        Node next;                      //address of the next node

        Node(Object data){                 // If there is Node(int data) - it means the nodes can store only int data type
            this.data = data;
        }
    }





    public static void main(String[] args) {



        // There can be only one copy of each key in a hashmap.
        // It is case sensitive
        // Null key can be entered once and null value multiple times
        //It maintains no order


        // Syntax
        // Map<String, Integer> mp = new HashMap<>();                                      /* Hash Map */

        Hashtable<String, Integer> mp = new Hashtable<>();                           /* Default constructor */
        
        // Hashtable<String, Integer> mp = new Hashtable<>(20);                         /* Initial capacity specified */
        // Hashtable<String, Integer> mp = new Hashtable<>(20, 0.5f);                   /* Initial capacity and load factor specified */
        // Hashtable<String, Integer> table = new Hashtable<>(map);                     /* Created from another map */


        // Adding elements
        mp.put("Ronaldo", 400);             /* The whole thing is called entry. String is the key and Int is the value */
        mp.put("Messi", 300); 
        mp.put("Neymar", 250); 
        mp.put("Lewandoski", 100); 
        mp.put("Dybala", 150); 
        mp.put("Pepe", 50); 






        // To get a value from a key from the hashmap
        System.out.println(mp.get("Ronaldo"));     /* It will show the value- 400 */
        System.out.println(mp.get("Lamine"));      // null





        // To update the value of a key
        mp.put("Ronaldo", 500);
        System.out.println(mp.get("Ronaldo")); 






        // To remove a pair from the hashmap
        mp.remove("Dybala");
        System.out.println(mp.get("Dybala"));       //null






        // To check if a key exists (true/false)
        System.out.println(mp.containsKey("Ronaldo"));






        // To check if a key exists and then put 
        mp.putIfAbsent("Vini", 450);






        // To see all the things in the hashmap

        // For keys
        System.out.println(mp.keySet());

        // For values
        System.out.println(mp.values());

        // For both
        System.out.println(mp.entrySet());








        // Ctreating hashtable with array
        Node[] hashtable = new Node[3];

        













    }




}

