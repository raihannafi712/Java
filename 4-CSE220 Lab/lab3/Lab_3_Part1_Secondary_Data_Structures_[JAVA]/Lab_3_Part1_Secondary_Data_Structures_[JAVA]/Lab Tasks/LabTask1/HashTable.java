/*You will have to complete the FruitNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and insert()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/
public class HashTable {

    //ht[] :: is the HashTable array that stores the FruitNode objects
    private FruitNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new FruitNode[size];
    }
    
    //This method basically prints the HashTable
    //DO NOT change this method
    public void show(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" " );
            FruitNode n = ht[i];
            while (n!=null){
                System.out.print("('"+n.fruit[0]+"', "+n.fruit[1]+") --> ");
                n = n.next;
            }
            System.out.println();
        }
    }

    //you need to COMPLETE this method
    private int hashFunction( String key ){
       int n = key.length();
        int sum = 0;

        if (n % 2 == 0) {
            // Even length: sum ASCII of even indices (0, 2, 4...)
            for (int i = 0; i < n; i += 2) {
                sum += (int) key.charAt(i);
            }
        } else {
            // Odd length: sum ASCII of odd indices (1, 3, 5...)
            for (int i = 1; i < n; i += 2) {
                sum += (int) key.charAt(i);
            }
        }

        // Modulo by the length of the array to get a valid index
        // Fixed: changed FruitNode[].length to ht.length
        return sum % ht.length;
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){
int index = hashFunction(key);
        FruitNode current = ht[index];

        // STEP 1: Check for duplicate key first
        while (current != null) {
            if ( ((String) current.fruit[0]).equals(key) ) {
                // Key exists! Update the price (value) and exit the function.
                current.fruit[1] = value;
                return; 
            }
            current = current.next;
        }

        // STEP 2: Key is new, create the node
        FruitNode newNode = new FruitNode(key, value);
        
        // Reset 'current' back to the head of the chain for this index
        current = ht[index];
        FruitNode prev = null;

        // STEP 3: Find the correct insertion point (Descending order by price)
        // Keep traversing as long as current's price is >= our new price
        while (current != null && (Integer) current.fruit[1] >= value) {
            prev = current;
            current = current.next;
        }

        // STEP 4: Insert the node into the linked list
        if (prev == null) {
            // Insert at the head (either list was empty, or new price is the highest)
            newNode.next = ht[index];
            ht[index] = newNode;
        } else {
            // Insert in the middle or at the end of the chain
            newNode.next = current;
            prev.next = newNode;
        }
    }

}
