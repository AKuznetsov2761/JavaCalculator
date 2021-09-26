package StringCalc;

public class CalcWord {

    static public String calc(String p1, String p2, char oper) throws Exception {
        String res = p1;

        switch (oper) {

            case '+':

                return res + p2;

            case '-':
                if (p1.contains(p2)) {
                    return p1 = p1.replaceAll(p2, "");
                    // p1.substring(0, p1.length() - p2.length());
                }
                return p1;

            default:
                throw new Exception("Unknown operation");

        }
    }
}