/*You will have to complete the PairNode Contrustor first
 then within this class you only have to complete two methods
 hashFunction() and searchHashtable()
 the rest of the metods are already written
 DO NOT TOUCH any other methods or codes*/

import org.w3c.dom.Node;

public class HashTable {

    //ht[] :: is the HashTable array that stores the PairNode objects
    private PairNode[] ht;

    //Constructor that initializes the HashTable array
	//DO NOT change this Constructor
    public HashTable(int size){
        this.ht = new PairNode[size];
    }

    //This method is called to insert each pair from the 2D Array
	//DO NOT change this method
    public void createFromArray(Object[][] arr){
        for( Object[] x: arr )
            this.insert( x );
    }

    //The insert() method inserts the pair into proper Hashed Index
	//This method is already written including collision resolve using Forward Chaining
    //DO NOT change this method
    public void insert(Object[] keyValuePair){
        String key = (String)keyValuePair[0];
        Integer value = (Integer)keyValuePair[1];
        String srchResult = this.searchHashtable(keyValuePair);
        if ( srchResult==null ) {
            System.out.println("Incomplete searchHashTable() and hashFunction() method");
        } else if ( srchResult.equals( "Found" ) ){
            System.out.println("("+key+","+value+") already Inserted. Cannot reinsert.");
        } else {
            int hashedIndex = this.hashFunction( key );
            PairNode newPNode = new PairNode( key, value );
            if ( this.ht[hashedIndex] == null ){
                this.ht[hashedIndex] = newPNode;
            } else {
                newPNode.next = this.ht[hashedIndex];
                this.ht[hashedIndex] = newPNode;
            }
        }
    }

    //This method basically prints the HashTable
    //DO NOT change this method
    public void printHashTable(){
        for(int i=0; i<ht.length; i++){
            System.out.print( i+" : " );
            PairNode pNode = ht[i];
            if( pNode==null ) System.out.println("null");
            while (pNode!=null){
                System.out.print("(Key: "+pNode.key+", Value: "+pNode.value+") --> ");
                if (pNode.next==null) System.out.println("null");
                pNode = pNode.next;
            }
        }
    }

	//you need to COMPLETE this method
    private int hashFunction( String key ){

        int key_len = key.length();
        int sum = 0;

        if (key_len % 2 == 0) {

            for (int i = 0; i < key_len - 1; i += 2) {
                
                char ch_1 = key.charAt(i) ;
                char ch_2 = key.charAt(i+1) ;

                sum += (int)ch_1 + (int) ch_2;
            }
            
        } else {
            key = key + "N";                                /* String concatenaton and new string length is +1 */

                for (int i = 0; i < key_len - 1; i += 2) {
                
                char ch_1 = key.charAt(i) ;
                char ch_2 = key.charAt(i+1) ;

                int asci_1 = (int) ch_1;                    /* exmp- 77 */
                int asci_2 = (int) ch_2;                    /* exmp- 111 */

                String fin = String.valueOf(asci_1) + String.valueOf(asci_2);               /* "77" + "111" converting int to string and add*/

                sum += Integer.parseInt(fin);

                
            }
        }
        
        return (sum % ht.length);           /* sum % array length so that index comes with in 0 to 5 */
    }


	//you need to COMPLETE this method
    //Hint: you may need to use Integer.parseInt() to convert from String to Integer
    public String searchHashtable( Object[] keyValuePair ){                             /* Object array is holding string key in index 0 and value int in index 1 */

        String s_key = (String) keyValuePair[0];
        int idx = hashFunction(s_key);

        PairNode curr = ht[idx];

        while (curr != null) {
            
            if (curr.key.equals(s_key)) {
                
                return "Found";
            }
            curr = curr.next;
        }

        return "Not found";
        
    }

}
