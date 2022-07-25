public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] age = new int[][]{{4,5,3,6,5},{34,44,28,38,41}};
        //Print second colum values
        System.out.println("Child - " + age[0][1]);
        System.out.println("Parent - " + age [1][1]);

        //Example 2
        String[][] names = new String[2][5];//2rows, 5 columns

        //1st row
        names[0][0] = "Alice";
        names[0][1] = "Bob";
        names[0][2] = "Jhon";
        names[0][3] = "Lucas";
        names[0][4] = "Joshua";
        //2'nd row
        names[1][0] = "Maria";
        names[1][1] = "Vanesa";
        names[1][2] = "Daren";
        names[1][3] = "Cyril";
        names[1][4] = "Lewis";
        //Number of rows
        System.out.println(names.length);

        //Number of columns
        System.out.println(names[1].length);

        //Print out all the elements
        //i - rows
        //j - columns

        for(int i = 0; i < names.length; i++){
            System.out.println("Row no. " + (i+1);

            for(int j = 0; j < names[i].length; j++ ){
                System.out.println(names[i][j]);

            }

        }
    }
}
