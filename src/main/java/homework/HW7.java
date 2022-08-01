package homework;

import java.util.Arrays;

public class HW7 {
    public static void main(String[] args) {
        int[]elements = {15, 32, 83, 49, 55, 67};
        System.out.println("Source Array: " + Arrays.toString(elements));

        int[]copy = new int [elements.length];

       // System.out.print("New Array: [");
        for(int i = 0; i < elements.length; i++ ){
            //System.out.print(elements[i] + ", ");
            copy[i] = elements[i];
        }
        //System.out.print(elements[elements.length-1] + "]");
        System.out.println();
        System.out.println("New Array: " + Arrays.toString(copy));
    }
}
