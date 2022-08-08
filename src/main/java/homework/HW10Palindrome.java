package homework;

import java.util.Scanner;

public class HW10Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a name");
        String name = scanner.nextLine().trim().toLowerCase().replaceAll(" ","");
        boolean isPalindrome = true;

        for(int i = 0; i < name.length()/2; i++) {
            if (name.charAt(i) != name.charAt(name.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.printf("%s is a palindrome  \n", name);
        }else {
                System.out.printf("%s is not a palindrome \n",name);
        }


    }
}
