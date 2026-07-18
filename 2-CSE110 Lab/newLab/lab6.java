package newLab;

import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {

        // LAB TASKS

        // ASCII values- A - Z = (65 - 90) && a - z = (97 - 122)
        // A to a gap 32 , B to b gap 32....

        // TASK 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s1 = sc.nextLine();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int asci = (int)ch;

            if (asci >= 97 && asci <= 122  ) {
                asci = asci - 32;
            }

             s2 += (char) asci;
        }

        System.out.println(s2);














        // TASK 5

    // Scanner sc = new Scanner(System.in);
    // String s1 = sc.nextLine();              /* CSE is easy */
    // String s2 = "";
    // String result = "";

    // for(int i = 0; i < s1.length(); i++){
    //   char ch = s1.charAt(i);

    //   if(ch == ' '){
    //     if(result.equals("")){
    //       result = s2;
    //     }
    //     else{
    //       result = s2 + " " + result; 
    //     }
    //     s2 = "";
    //   }
    //   else{
    //     s2 = s2 + ch;
    //   }
    // }
    // if(result.equals("")){
    //   result = s2;
    //   }
    // else{
    //   result = s2 + " " + result;
    // }
    // System.out.println(result);
  








































        // // TASK 1    prac

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter phrase: ");
        // String secret_phrase_code = sc.nextLine();


        // int total_vowels = 0, total_consonants = 0;
        // for (int i = 0; i < secret_phrase_code.length(); i++) {

        //     char one_count_ch = Character.toLowerCase(secret_phrase_code.charAt(i));

        //     if (one_count_ch >= 'a' && one_count_ch <= 'z') {
        //         if (one_count_ch == 'a' || one_count_ch == 'e' || one_count_ch == 'i' || one_count_ch == 'o' || one_count_ch == 'u') {

        //             total_vowels++;

        //         } else {

        //             total_consonants++;
        //         }
        //     }
        // }

        // if (total_vowels > 0 && total_consonants > 0 && total_vowels % 3 == 0 && total_consonants % 5 == 0) {

        //     System.out.println("Aaarr! Me Plunder!!");
        // } else {

        //     System.out.println("Blimey! No Plunder!!");
        // }

        // sc.close();



        // TASK 2       prac

        // Scanner sc = new Scanner(System.in);
        // System.out.println("First input: ");
        // String input_string_one = sc.nextLine();


        // System.out.println("Second input: ");
        // String input_string_two = sc.nextLine();


        // String final_string = "";
        // for (int i = 0; i < input_string_one.length(); i++) {

        //     char temp_char = input_string_one.charAt(i);
            
        //     if (!input_string_two.contains(String.valueOf(temp_char))) {

        //         final_string += temp_char;
        //     }
        // }

        // for (int i = 0; i < input_string_two.length(); i++) {


        //     char ch = input_string_two.charAt(i);
        //     if (!input_string_one.contains(String.valueOf(ch))) {

        //         final_string += ch;

        //     }
        // }
        // System.out.println( final_string.toUpperCase());
        // sc.close();



        // TASK 3

        // Scanner sc = new Scanner(System.in);
        // System.out.println("First input: ");
        // String input_string = sc.nextLine();

        // String final_String = "";
        // int letter_count = 0;

        // for (int i =  0; i < input_string.length(); i++) {
            
        //     char ch = input_string.charAt(i);
        //     int ch_ascii = (int) ch;
            

        //     if ((ch_ascii >= 65 && ch_ascii <= 90 )|| (ch_ascii >= 97 && ch_ascii <= 122) ) {     /* A-Z is 65 to 90 */ /* a-z is 97 to 122 */

        //         if (letter_count % 2 == 0 ) {              

        //         char lower_char = Character.toLowerCase(ch);
        //         final_String += lower_char;

        //         } else  {         

        //             char upper_char = Character.toUpperCase(ch);
        //             final_String += upper_char;   
        //         }
        //         letter_count++;

        //     } else {
                
        //         final_String += ch;
        //     }
        // }
        // System.out.println(final_String);




        // TASK 4

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Password: ");
        // String input_check_pass = sc.nextLine();


        // boolean upper_case_found = false;
        // boolean lower_case_found = false;
        // boolean digit_check = false;
        // boolean special_char_check = false;

        // if (input_check_pass.length() >= 8) {

        //     for (int i = 0; i < input_check_pass.length(); i++) {

        //         char check_char = input_check_pass.charAt(i);

        //         if (Character.isUpperCase(check_char)) {

        //             upper_case_found = true;
        //         } else if (Character.isLowerCase(check_char)) {

        //             lower_case_found = true;
        //         } else if (Character.isDigit(check_char)) {

        //             digit_check = true;
        //         } else {

        //             special_char_check = true;
        //         }
        //     }

        //     if (upper_case_found && lower_case_found && digit_check && special_char_check) {

        //         System.out.println("True");

        //     } else {

        //         System.out.println("False");
        //     }
        // } else {

        //     System.out.println("False");
        // }

        // sc.close();




        // TASK 5           prac

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Name: ");
        // String input_string_one = sc.nextLine().toLowerCase();


        // System.out.println("Pass: ");
        // String input_string_two = sc.nextLine().toLowerCase();

        // boolean pass_validity = true;

        // for (int i = 0; i <= input_string_two.length() - input_string_one.length(); i++) {

        //     boolean name_similarity = true;

        //     for (int j = 0; j < input_string_one.length(); j++) {

        //         if (input_string_two.charAt(i + j) != input_string_one.charAt(j)) {
        //             name_similarity = false;
        //             break;
        //         }
        //     }
            
        //     if (name_similarity) {

        //         pass_validity = false;
        //         break;
        //     }
        // }

        // if (pass_validity) {
        //     System.out.println("Valid");
        // } else {
        //     System.out.println("Invalid");
        // }

        // sc.close();


 



    }
}
