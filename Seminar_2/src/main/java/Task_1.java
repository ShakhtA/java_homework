import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        /*
        Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
        используя StringBuilder или String. Данные для фильтрации приведены ниже в виде json-строки.
        Если значение null, то параметр не должен попадать в запрос.
        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        // {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        String inputStr = in.nextLine();
        in.close();
        System.out.println(inputStr);

        inputStr = inputStr.replaceAll("[\"{}\" \"]", " ");

        String[] params = inputStr.split(",");

        StringBuilder outStr = new StringBuilder();
        for (int i = 0; i < params.length; i++) {
            outStr.append(params[i].trim().replace(" : ", "='"));
            if (i != params.length - 1) {
                outStr.append("' AND ");
            }
        }

        int index = outStr.lastIndexOf("=");
        outStr.replace(index, outStr.length(), " IS NOT NULL");

        System.out.println(outStr); //  name='Ivanov' AND country='Russia' AND city='Moscow' AND age IS NOT NULL
    }
}