package StringCalc;

public class CalcNum {
    static public String calc(String p1, int p2_num, char oper) throws Exception {

        String res = p1;
        switch (oper) {

            case '*':
                while ((p2_num - 1) > 0) {

                    res += p1;
                    --p2_num;
                }

                if (res.length() > 40) {
                    return res.substring(0, 40) + "." + "." + ".";
                }
                return res;

            case '/':
                int cut = p1.length() / p2_num;
                return p1.substring(0, cut);

            default:
                throw new Exception("Illegal operation");

        }
    }
}