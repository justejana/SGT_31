package homework;

import java.util.Arrays;

public class HW8 {
    public static void main(String[] args) {

        int[]original = {15, 75, 951, 784, 255};
        System.out.println("Original array " + Arrays.toString(original));

        for(int i = 0; i < original.length/2; i++){
        int temp = original[i];
        original[i] = original[original.length-1 -i];
        original[original.length-1 -i] = temp;
        }
        System.out.print("Reverse array: " + Arrays.toString(original));
    }
}
