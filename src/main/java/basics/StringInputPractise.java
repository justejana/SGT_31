package basics;

import java.util.Scanner;

public class StringInputPractise {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your Name and Age (John 30)");

        //Read String from user and get rid of spaces(trim)
        String input = scanner.nextLine().trim();
        // Get substring of last two characters in the string
        String name = input.substring(input.length()-2);
        System.out.println("Substring " + name);
        //Convert those integer
        int age = Integer.parseInt(name);

        //If age is over 70 then print "Senior", if not - "Adult"
        if (age >= 70){
            System.out.println("Senior");
        } else {
            System.out.println("Adult");
        }
    }

}
