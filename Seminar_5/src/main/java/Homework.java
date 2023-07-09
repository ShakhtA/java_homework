/*
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.
 */

import java.util.*;

public class Homework {
    public static void main(String[] args) {

        // Создание и заполнение телефонной книги
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        final String PREFIX = "+7";
        while (true) {
            System.out.println("Введите фамилию, имя, отчество: ");
            
            // Приведение введенного имени к формату "Фамилия Имя Отчество"
            String[] inputString = scanner.nextLine().trim().split(" ");
            StringBuilder outString = new StringBuilder("");
            for (int i = 0; i < inputString.length; i++) {
                if (inputString[i] != "") {
                    String tmp = inputString[i].toLowerCase();
                    outString.append(tmp.substring(0, 1).toUpperCase());
                    outString.append(tmp.substring(1) + " ");
                }
            }
            String name = outString.toString().trim();
            
            System.out.println("Введите номер телефона");
            String phone = PREFIX.concat(scanner.nextLine());
            ArrayList tmp = new ArrayList<>();
            if (phoneBook.containsKey(name)) {
                tmp.addAll(phoneBook.get(name));
                tmp.add(phone);
                phoneBook.put(name, tmp);
            } else {
                tmp.add(phone);
                phoneBook.put(name, tmp);
            }
            System.out.println("Для продолжения нажмите Enter, для выхода - любую клавишу");
            if (scanner.nextLine() != "") break;
        }
        System.out.println(phoneBook);

        // Создание списка с длинами значений из телефонной книги. Значения не будут повторяться.
        ArrayList<Integer> arraySizes = new ArrayList<>(phoneBook.size());
        for (ArrayList item : phoneBook.values()) {
            if (!arraySizes.contains(item.size()))
                arraySizes.add(item.size());
        }

        Object[] array = arraySizes.toArray();
        Arrays.sort(array);

        // Вывод phoneBook по убыванию числа телефонов
        for (int j = array.length - 1; j > -1; j--) {
            for (var item : phoneBook.entrySet())
                if (item.getValue().size() == (int) array[j])
                    System.out.printf("%s: %s\n", item.getKey(), item.getValue());
        }
    }
}
