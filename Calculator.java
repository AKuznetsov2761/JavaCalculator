package akuznetsov.javacalc;

public class Calculator {
    static public int operation(int num1, char op, int num2) throws Exception {
        if (num1 <= 0 || num2 <= 0 || num1 >= 11 || num2 >= 11)
            throw new Exception("Numbers out of allowed range");

        switch (op) {
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                return num1/num2;
            default:
                throw new Exception("Unknown operation");
        }
    }
}