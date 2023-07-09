/*
Приведение входной строки ФИО к стандартному виду.
 */

import java.util.*;

public class InputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО:");
        String inputString = scanner.nextLine();

        String[] tmpStrings = inputString.trim().split(" ");
        StringBuilder outString = new StringBuilder("");
        for (int i = 0; i < tmpStrings.length; i++) {
            if (tmpStrings[i] != "") {
                String tmp = tmpStrings[i].toLowerCase();
                outString.append(tmp.substring(0, 1).toUpperCase());
                outString.append(tmp.substring(1) + " ");
            }
        }
        System.out.println(outString);
    }
}