package homework;

import java.util.Arrays;

public class HW12MinMaxMethods {
    public static void main(String[] args) {
        int [] my_array = {58, 478, 859, 465, 25, 78, 65, 874, 456, 1085};
        System.out.println("Original array: " + Arrays.toString(my_array));
        System.out.println("Maximum value for the above array " + max(my_array));
        System.out.println("Maximum value for the above array " + min(my_array));
    }
    public static int max(int [] my_array){
        int max = my_array[0];
        for (int i = 1; i < my_array.length; i++)
            if (my_array[i] > max)
                max = (my_array[i]);
    return max;
    }

    public static int min(int [] my_array){
        int min = my_array[0];
        for (int i = 1; i < my_array.length; i++)
            if (my_array[i] < min)
                min = (my_array[i]);
        return min;
    }

}
