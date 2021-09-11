package akuznetsov.javacalc;

public class Calculator2 {
    static public int operation(int num1, char op, int num2) throws Exception {
        if (num1 <= 0 || num2 <= 0 || num1 >= 10 || num2 >= 10)
            throw new Exception("Числа вне допустимого диапазона");

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
                throw new Exception("Неизвестная операция");
        }
    }
}