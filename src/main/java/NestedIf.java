import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score");
        float score = scanner.nextFloat();

        if (score <= 40.0f){
            System.out.println("Score: <= 40%");
        } else if (score > 40.0f && score <= 80.0f){
            System.out.println("40% < score <= 80%");
            if (score <= 70.0f) {
                System.out.println("<= 70");
            } else {
                System.out.println("> 70");
            }
        }else {
            System.out.println("80 % < score <= 100%");
            if((int)score%2 == 0){
                System.out.println("Even number");
            } else {
                System.out.println(("Odd number");
            }
//Koments

        }
    }
}
