package akuznetsov.javacalc;

public class RomanParser {
    public static int parseInt(String str) throws Exception {
        String[] romanDigit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int val = 0;
        for (int i = 1; i < romanDigit.length; i++)
            if (str.equals(romanDigit[i])) val = i;

        if ((val < 1) || (val > 10)) {
            throw new Exception("Выход за диапазон");
        }

        return val;
    }

    public static String toString(int number) {
        String[] romanDigit = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] romanDecim = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String romdigit;
        //       romdigit = romanDecim[valsum / 10]  + romanDigit[Math.abs(valsum - (valsum /10) * 10)];
        romdigit = romanDecim[number / 10]  + romanDigit[Math.abs(number % 10)];
        if (number < 0) romdigit = "-" + romdigit;
        if (number == 0) romdigit = "ноль";
        return romdigit;
    }
}
