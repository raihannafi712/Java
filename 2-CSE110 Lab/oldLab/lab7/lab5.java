package oldLab.lab7;
import java.util.Arrays;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {


        //  TASK 1

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter String: ");
        // String input = sc.nextLine();

        // String upper_Case_insert = "";

        // for (int i = 0; i < input.length(); i++) {

        //     char character_size = input.charAt(i);

        //     if (character_size >= 'a' && character_size <= 'z') {
                
        //         int ascii = (int)character_size - 32;

        //         upper_Case_insert += (char) ascii;
        //     } else {

        //         upper_Case_insert += character_size;
        //     }
        // }
        // System.out.println(upper_Case_insert);
        // sc.close();


        // TASK 2

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter a string: ");
        // String input_string = scanner.nextLine();


        // String reversed_input = "";

        // for (int i = input_string.length() - 1; i >= 0; i--) {

        //     reversed_input += input_string.charAt(i);

        // }

        // System.out.println(input_string.equals(reversed_input));
        
        // scanner.close();



        // TASK 3

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter String: ");
        // String input_string = sc.nextLine();

        // System.out.println("Enter sign: ");
        // char original_sign = sc.next().charAt(0);

        // String temp_string = "";

        // for (int i = 0; i < input_string.length(); i++) {

        //     if (input_string.charAt(i) == original_sign) {

        //         System.out.println(temp_string);
        //         temp_string = "";

        //     } else {
        //         temp_string += input_string.charAt(i);
        //     }
        // }
        // System.out.println(temp_string); 
        // sc.close();




        //  TASK 4

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string: ");
        // String input_string = sc.nextLine();

        // String reversed_one_string = "";

        // for (int i = input_string.length() - 1; i >= 0; i--) {

        //     reversed_one_string += input_string.charAt(i);

        // }

        // System.out.println("Reversed string: " + reversed_one_string);
        // sc.close();



        // TASK 5

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



        // TASK 6

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string: ");
        // String input_String = sc.nextLine();
        

        // String[] separate_parts = input_String.split(" ");
        // String Input_reversed = "";

        // for (int i = separate_parts.length - 1; i >= 0; i--) {

        //     Input_reversed += separate_parts[i];

        //     if (i != 0) {

        //         Input_reversed += " ";
                
        //     }
        // }
        // System.out.println("Reversed words: " + Input_reversed);
        // sc.close();



        // TASK 7

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


        // TASK 8          /* couldn't figure out */



        // TASK 9

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


    }
}
