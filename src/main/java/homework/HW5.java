package homework;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        for (int i = 0; i > number; number++) {
            System.out.println(number);
        } for (int i = 0; i < number; number--) {
            System.out.println(number);
            }

        System.out.println("0");
    }
}