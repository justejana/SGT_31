import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

        String text1 = "This is text example";

        String text2 = text1.intern();
        System.out.println(text2);

        //Contation of strings

        String input1 = "Tis is ";
        String input2 = "input text.";

        String inputCombined = input1.concat (input2);
        System.out.println(inputCombined);

        //equals comparing strings

        String val1 = "Test";
        String val2 = "Test";
        System.out.println(val1.equals(val2));

        //String class methods

        String inputText = "This is my text";

        //Length
        System.out.println(inputText.length());

        //To uppercase
        System.out.println(inputText.toUpperCase());

        //To lowercase
        System.out.println(inputText.toLowerCase());

        //IndexOf()

        String speakingText = "This is test value";
        System.out.println(speakingText.indexOf('e'));
        System.out.println(speakingText.indexOf(" is "));

        //ReplaceAll()
        //ūdas

        String textForTV = "This phone is complete šūdas. And this case is also šūdas.";
        System.out.println(textForTV.replaceAll("šūdas", "š***s"));

        //Character index
        System.out.println(textForTV.charAt(textForTV.length()-1));

        //Substring
        System.out.println(textForTV.substring(5));
        System.out.println(textForTV.substring(5,10));

        //Parsing
        //Converting String to primitive Data types

        String intValue = "165";
        String floatValue = "2.0";
        String doubleValue = "5.856262";
        String boolValue = "true";
        String longValue = "100000000000000";

        System.out.println(Integer.parseInt(intValue) + 4);

        //Trim method


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter password(qwert*)");
        //Noņemt space un samazinaat burtus
        String pswd = scanner.nextLine().trim().toLowerCase();

        if (pswd.equals("qwerty")) {
            System.out.println("Password correct");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
