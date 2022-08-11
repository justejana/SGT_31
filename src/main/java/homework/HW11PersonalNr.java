package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW11PersonalNr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your personal number");
        String number = scanner.nextLine();

        Pattern patern1 = Pattern.compile("[0-9]{6}-?[0-9]{5}");
        Matcher matcher1 = patern1.matcher(number);
        boolean correctnumber = matcher1.matches();

        if(correctnumber){
            System.out.println("Your inputted personal number is valid");
        }else{
            System.out.println("Your inputted personal number is not valid");
        }
        System.out.println("Do you want to check your personal number again? y/n");
        String answer = scanner.nextLine();

        while (answer.equals("y")) {
            System.out.println("Please enter your personal number");
            number = scanner.nextLine();

            if(correctnumber){
                System.out.println("Your inputted personal number is valid");
            }else{
                System.out.println("Your inputted personal number is not valid");
            }
            System.out.println("Do you want to check your personal number again? y/n");
            answer = scanner.nextLine();
        }
    }
}
