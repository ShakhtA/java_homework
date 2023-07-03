/*
Дана json-строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Task_2 {
    public static void main(String[] args) throws IOException {


        File inputFile = new File("InputFile.json");
        if (inputFile.exists()) {
            FileReader reader = new FileReader(inputFile);
            int c;
            StringBuilder inStr = new StringBuilder();
            while ((c = reader.read()) != -1) {
                inStr.append((char) c);
            }
            reader.close();

            String inputStr = String.valueOf(inStr);
            System.out.println(inputStr);

            inputStr = inputStr.replace(",", ":");
            inputStr = inputStr.replaceAll("[\"\\[\\]{]", "");
            StringBuilder tmpStr = new StringBuilder(inputStr);
            tmpStr.deleteCharAt(tmpStr.length() - 1);

            String[] params = String.valueOf(tmpStr).split("}:");
            for (int i = 0; i < params.length; i++) {
                printResultStr(params[i], ":");
            }
        } else {
            System.out.println("Файл не найден");
        }
    }

    private static void printResultStr(String inStr, String ch) {
        String[] tmp = inStr.split(ch);
        String outString = "Студент " + tmp[1] + " получил " + tmp[3] + " по предмету " + tmp[5];
        System.out.println(outString);
    }

}