import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<String> families = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> oldNames = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        while (true) {

            System.out.println("Введите ФИО, возраст и пол");
            families.add(scanner.nextLine());
            names.add(scanner.nextLine());
            oldNames.add(scanner.nextLine());
            ages.add(scanner.nextInt());
            //scanner.nextLine();
            gender.add(scanner.nextLine());
            id.add(gender.size() - 1);

            System.out.println("Продолжить ввод? Для продолжения нажмите Y, для выхода - N.");
            String tmp = scanner.nextLine();
            if (tmp.toUpperCase().contains("N")) break;

        }
        for (int i = 0; i < families.size(); i++) {
            System.out.printf("%s %s %s %d %s\n", families.get(i), names.get(i), oldNames.get(i), ages.get(i), gender.get(i));
        }
        System.out.println(families);
        System.out.println(names);
        System.out.println(oldNames);
        System.out.println(ages);
        System.out.println(gender);
        System.out.println(id);

        for (int item : id) {
            System.out.printf("%s %s %s %d %s\n",
                    families.get(item), names.get(item), oldNames.get(item), ages.get(item), gender.get(item));
        }

        System.out.println("Для сортировки по возрасту нажмите Y, для выхода - N");
        String tmp = scanner.nextLine();
        if (tmp.toUpperCase().contains("Y")) {

            // Сортировка по возрасту и полу. Если возраст одинаковый, то сначала идет женщина, затем мужчина
            for (int i = 0; i < id.size(); i++) {
                for (int j = 0; j < id.size() - 1 - i; j++) {
                    if ((ages.get(id.get(j)) > ages.get(id.get(j + 1))) ||
                            (((ages.get(id.get(j)) == ages.get(id.get(j + 1)))) &&
                                    ((gender.get(id.get(j)).toLowerCase().compareTo(gender.get(id.get(j + 1)).toLowerCase())) > 0))) {
                        int temp = id.get(j);
                        id.set(j, id.get(j + 1));
                        id.set(j + 1, temp);
                    }
                }
            }

            for (int item : id) {
                System.out.printf("%s %s %s %d %s\n",
                        families.get(item), names.get(item), oldNames.get(item), ages.get(item), gender.get(item));
            }
        }
    }
}

