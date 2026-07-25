package LabTask2;

import java.util.Queue;

public class RemoveConsecutiveDuplicates{
	
    // You have to write this method
    // YOU MUST SUBMIT THIS METHOD
    public static String removeConsecDups(String word){

        LinkedListQueue temp_q = new LinkedListQueue();
        LinkedListQueue final_q = new LinkedListQueue();
        char c2 = 0;

        for (int i = 0; i < word.length(); i++) {
            temp_q.enqueue(word.charAt(i));                 /* Adding each character from the string to a temp queue */
        }

        while (temp_q.isEmpty() != true) {

            char c = (char) temp_q.peek();                  /* Need to cast because queue has objects as elements */

            if (final_q.isEmpty() == true ) {

                c2 = c;
                final_q.enqueue(temp_q.dequeue());
                continue;
            }
            
            if (c != c2) {

                c2 = c;
                final_q.enqueue(temp_q.dequeue());
                
                
            }else{
                temp_q.dequeue();
            }
            
        }

        //Creating final string
        String result = "";

        while (final_q.isEmpty() != true) {
            result = result + (char) final_q.dequeue();
        }


        return result;






    }
    
    //DO NOT CHANGE and DO NOT SUBMIT THIS METHOD
    public static void assertTest(Object actual, Object expected) {
	if( actual==null || !actual.equals(expected)){
            System.out.println("Test Failed! Expected: " + expected + ", but got: " + actual);
	} else {
            System.out.println("Test Success!!! Expected: " + expected + ", but got: " + actual);
        }
    }

    //DO NOT SUBMIT THE TESTER METHOD
    //DO NOT MODIFY THE MAIN METHOD
    public static void main(String[] args) {
        System.out.println("Test 01");
        String string1 = "aabbbccccdd";
        String returned1 = removeConsecDups(string1);
        assertTest(returned1, "abcd");
        System.out.println("-----------------------------------------");

        System.out.println("Test 02");
        String string2 = "aaabbaa";
        String returned2 = removeConsecDups(string2);
        assertTest(returned2, "aba");
        System.out.println("-----------------------------------------");

        System.out.println("Test 03");
        String string3 = "abcabcabc";
        String returned3 = removeConsecDups(string3);
        assertTest(returned3, "abcabcabc");
        System.out.println("-----------------------------------------");

        System.out.println("Test 04");
        String string4 = "aaaaa";
        String returned4 = removeConsecDups(string4);
        assertTest(returned4, "a");
        System.out.println("-----------------------------------------");
    }
}
