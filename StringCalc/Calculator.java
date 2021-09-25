package StringCalc;

public class Calculator {
    static public String operation(String part1, String part2, char op, String metod) throws Exception {

        String result = part1;
        if (part1.length() >= 11 || part2.length() >= 11) {
            throw new Exception("The string is too long");
        }
        switch (metod) {

            case "num":

                int part2_num = Integer.parseInt(part2);

            if (part2_num >= 11 || part2_num <= 0) {
                throw new Exception("Number out of range");
            }
            result = CalcNum.calc(part1, part2_num, op);
return result;
            // if (num)

            case "word":


                result = CalcWord.calc(part1, part2, op);
return result;
            } // switch (op)

        return result;

    } // Exception

        } // Calculator
