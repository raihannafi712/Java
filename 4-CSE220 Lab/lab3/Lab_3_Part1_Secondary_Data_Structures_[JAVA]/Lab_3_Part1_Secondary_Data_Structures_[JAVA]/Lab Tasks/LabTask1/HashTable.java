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

        int st_length = key.length();
        int sum = 0;

        if (st_length % 2 == 0) {
            
            for (int i = 0; i < st_length; i++) {           /* All the even character's ascii values will be summed */
                
                char ch = key.charAt(i);
                int ascii = (int)ch;

                if (i % 2 == 0) {
                    sum += ascii;
                } 
            }

        } else {
            
            for (int i = 0; i < st_length; i++) {           /* All the even character's ascii values will be summed */
                
                char ch = key.charAt(i);
                int ascii = (int)ch;

                if (i % 2 != 0) {
                    sum += ascii;
                } 
            }
        }
        int final_val = (sum % ht.length);                  /* ht is the array */


        return final_val;
    }

    //you need to COMPLETE this method
    //The insert() method will create a FruitNode using name(Key) & price(value)
	//then inserts it in the proper hashed index
    //If collision occurs resolve using the steps explained in the question
    public void insert(String key, Integer value){

        int idx = hashFunction(key);                /* The index where the fruit is in the array list */
        FruitNode n = ht[idx];


        //If the fruit still exists
        while (n != null ) {
            
            if (((String) n.fruit[0]).equals(key) ) {       /* It checks if we have the same fruit they gave us */
                n.fruit[1] = value;                         /* Updating the value. Basically if apple is in the 0 index, then it will just go to that node and update the price. No new node will be created in the chain  */
                return;
            }
            n = n.next;                                     /* n is traversing through the node chain of fruit[0]. ONLY THE NAME */
        }


        n = ht[idx];                                        /* n went back to first node of ht's index(if its apple then index 0) */
        FruitNode temp = null;                              /* temp will work as the previous node */


        //If its a new fruit
        FruitNode new_node = new FruitNode(key, value);

        while (n != null && value <= (int) n.fruit[1]) {    /* prices will be in descending order.So, if value is greater than any node's price then it will stop */
            
            temp = n;                                       /* If the first node has less price then loop won't even runn and temp = null  */
            n = n.next;

        }

        if (temp == null) {                                 /* if first node is null or new node comes before first node */
            
            new_node.next = n;
            ht[idx] = new_node;

        } else {                                            /* adding in the middle */
            
            new_node.next = n;
            temp.next = new_node;

        }

    }

}
