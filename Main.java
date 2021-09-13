package akuznetsov.javacalc;
import static akuznetsov.javacalc.StringSplitter.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Enter 2 integers from 1 to 10 (roman or arabic) and the only 1 operator: + - * / , examples: X - IV, 10 * 9 etc.");
            String instring = new Scanner(System.in).nextLine();
            // System.out.println("Вы ввели: " + instring);
            StringSplitter.split(instring);

            String[] results = StringSplitter.split(instring);
            // String int1_str, char(-+/*)symbol, String int2_str;
            int number1 = 0, number2 = 0;
            char symbol = results[1].charAt(0);
            boolean arabic = results[0].matches("[0-9]+") && results[2].matches("[0-9]+");
            if(arabic){
                // Arabic
                number1 = Integer.parseInt(results[0]);
                number2 = Integer.parseInt(results[2]);
            } else {
                // Roman
                number1 = RomanParser.parseInt(results[0]);
                number2 = RomanParser.parseInt(results[2]);
            }
            int res = Calculator.operation(number1, symbol, number2);
            // print result
            if(arabic) {
                System.out.println("Result: " + res);
            } else {
                //Roman output
                System.out.println("Result: " + RomanParser.toString(res));
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
