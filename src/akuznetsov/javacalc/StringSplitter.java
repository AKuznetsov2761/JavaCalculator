package akuznetsov.javacalc;

public class StringSplitter {
    static public String[] split(String instring) throws Exception {
        String[] res = new String[3];
        //Удалил пробелы  и табуляцию
        instring = instring.replaceAll("\\s", "");
        //Разделил на части
        String[] numbers  = instring.split("[+*/-]");
        if (numbers.length != 2)
            throw new Exception("Ввод должен содержать ровно 1 оператор");
        //char [] chars = instring.toCharArray();
        //char symbol = chars[numbers[0].length()];
        char symbol = instring.charAt(numbers[0].length());
        // return res[0], sym, res[1]
        res[0] = numbers[0];
        res[1] = String.valueOf(symbol);
        res[2] = numbers[1];
        return res;
    }
}
