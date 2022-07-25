package homework;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the required size of array (positive number)");
        int size = scanner.nextInt();
        int[] numbers = new int[size];


        System.out.println("Enter the elements of the array one by one");

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter element number " + (i + 1));
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Source Array ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //Print out all array's elements using For-each loop
        System.out.print("Source Array ");
        for(int temp : numbers){
            System.out.print(temp + " ");
        }
    }
}



