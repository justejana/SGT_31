package homework;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("basics.Input tree size");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = size; j > i; j--){
               System.out.print(" ");}
            for (int j = i*2; j>=0; j--){
                System.out.print("*");}
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
        System.out.print("#");
    }
}
