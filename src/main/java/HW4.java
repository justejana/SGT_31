import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name the year");
        int year = scanner.nextInt();

        if(year % 4 == 0)
        {
            if(year % 400 == 0 || year % 100 != 0) {
                System.out.println("Leap year");
            } else {
            System.out.println("Not a leap year");
            }
        } else {
         System.out.println("Not a leap year");
        }

    }
}
