package StringCalc;
import java.util.Scanner;
import static StringCalc.StringSplitter.*;
public class Main {
    public static void main(String[] args) throws Exception {

       // try {
            System.out.println("Enter in one string your expression with the only one operator: +-*/ and integer (1-10)");
            String instring = new Scanner(System.in).nextLine();
            // System.out.println("You enter " + instring); - проверка

            StringSplitter.split(instring);

            String[] results = split(instring);
            // разделили строку и отдали в массив

            String part1 = results[0], part2 = results[2], NumOrWord = results[3];

            char symbol = results[1].charAt(0);

            switch (NumOrWord) {

                case "num":


                    switch (symbol) {

                        case '-':
                        case '+':
                            throw new Exception("сложение или вычетание строки с числом невозможно");

                        case '/':
                        case '*':

                            String final_result = Calculator.operation(part1, part2, symbol, NumOrWord);
                            System.out.println(final_result);
                    } // switch symbol

                case "word":

                    switch (symbol) {

                        case '*':
                        case '/':
                            throw new Exception("деление или умножение между строками невозможно");

                        case '-':
                        case '=':

                            String final_result = Calculator.operation(part1, part2, symbol, NumOrWord);
                            System.out.println(final_result);
                    } // switch symbol


            } // switch NumOrWord
        /* }
        catch (Exception ex) {
            ex.printStackTrace();
        }

         */
    }
}
