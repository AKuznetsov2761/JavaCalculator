package StringCalc;

public class Calculator {
    static public String operation(String part1,  String part2, char op, String metod) throws Exception {

        String result = part1;
        if (metod.equals("num")) {
            int part2_num = Integer.parseInt(part2);

            if (part2_num >= 11 || part2_num <= 0 || part1.length() >= 11) {
                throw new Exception("number out of range or string too long");
            }
            switch (op) {

                case '*':
                    while ((part2_num - 1) > 0 || result.length() < 40) {

                        result += part1;
                        --part2_num;
                    }

                    if (result.length() < 40) {
                        return result.substring(0, 40) + "." + "." + ".";
                    }
                    return result;

                case '/':
                    int cut = part1.length() / part2_num;
                    return part1.substring(0, cut);

                default:
                    throw new Exception("Unknown operation");
            } // switch (op)
        } // if (num)

        if (metod.equals("word")) {

            switch (op) {

                case '+':

                    return result + part2;

                case '-':
                    if (part1.contains(part2)) {
                        return part1.substring(0, part1.length() - part2.length());
                    }
                    return part1;

                default:
                    throw new Exception("Unknown operation");
            } // switch (op)

        } // if word
        throw new Exception("Unknown operation");
    } // Exceptoin

} // Calculator
