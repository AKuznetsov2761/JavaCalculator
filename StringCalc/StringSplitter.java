package StringCalc;

public class StringSplitter {
    static public String[] split(java.lang.String instring) throws Exception {
        String[] res = new String[4];
        instring = instring.replaceAll("\\s", "");
// удалим лишние пробелы и табуляцию
        String[] numbers = instring.split("[+*/-]");
        // разделили строку на 3 части с оператором посередине

        if (numbers.length != 2)
            throw new Exception("It`s  should be 1 operator exactly!!!");

        // определяем оператор
        char symbol = instring.charAt(numbers[0].length());
        // предполагаем, что вторая часть выражения - слово
        res[3] = "word";
        // определяем первое слово
        int num_0 = numbers[0].indexOf('"');
        if (num_0 == -1) {
            throw new Exception("The only word should at first");
        }
        numbers[0] = numbers[0].substring(num_0 + 1);
        num_0 = numbers[0].indexOf('"');
        if (num_0 == -1) {
            throw new Exception("The first word should be in quotation marks");
        }
        numbers[0] = numbers[0].substring(0, num_0);

        // определяем второе слово или число
        num_0 = numbers[1].indexOf('"');
        if (numbers[1].matches("[0-9]+"))
        {
            // try {
            // проверяем является ли numbers[1] числом
            //int test2 = Integer.parseInt(numbers[1].trim());

            // подтверждаем, что вторая часть выражения - число
            res[2] = numbers[1];
            res[3] = "num";

           /* } catch (NumberFormatException nfe) {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            } */
        }
            else {

            numbers[1] = numbers[1].substring(num_0 + 1);
            num_0 = numbers[1].indexOf('"');
            if (num_0 == -1) {
                throw new Exception("The only word should at first");
            }
            numbers[1] = numbers[1].substring(0, num_0);
        }
            // передаем результат
            res[0] = numbers[0];
            res[1] = String.valueOf(symbol);
            res[2] = numbers[1];
            return res;

    }
}
