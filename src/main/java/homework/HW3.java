package homework;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the 1st number");
        int nr1 = scanner.nextInt();
        System.out.println("Input the 2nd number");
        int nr2 = scanner.nextInt();
        System.out.println("Input the 3rd number");
        int nr3 = scanner.nextInt();

       int max1 = Math.max(nr1, nr2);
        System.out.println(Math.max(max1, nr3));
    }
}
