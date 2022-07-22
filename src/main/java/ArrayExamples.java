public class ArrayExamples {
    public static void main(String[] args) {
        //Declare Array that will hold 3 String type variables
        String[] names = new String[3];

        // How to set array's element values
        names[0] = "Jana";
        names[1] = "Rita";
        names[2] = "Sāra";

        //How to get array's elements valie
        System.out.println(names[2]);

        int[] grades = new int [8];
        grades[0] = 10;
        grades[1] = 180;
        grades[2] = 140;
        grades[3] = 150;
        grades[4] = 160;
        grades[5] = 130;
        grades[6] = 120;
        grades[7] = 108;


        //How to get Array's size
        System.out.println("Array's size: " + grades.length);

        //Print out all elements
        for(int i = 0; i < grades.length;i++ ){
            System.out.print(grades[i] + " ");

        }
    }

}
