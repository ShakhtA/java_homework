/*
Создать мапу, обобщение целое число и строка, заполнить 10 значениями,
ключ случайное число от 0 до 1000 а значение, название буквы этого случайного числа.
 */
import java.util.*;

public  class ClassWork {
    public static void main(String[] args) {
        System.out.println(Character.getName(110));
        System.out.println();

        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        //HashMap<Integer, String> hashMap = new HashMap<>();
        Random rand = new Random();


        for (int i = 0; i < 10; i++) {
            int key = rand.nextInt(20);
            String value = Character.getName(key);
            hashMap.put(key, value);
        }

        for (var item : hashMap.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        System.out.println("================================");
/*
        Object[] values = null;
        values = hashMap.values().toArray();
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            for (var item : hashMap.entrySet()) {
                if (values[i].equals(item.getValue()))
                System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
            }
        }
        */

        System.out.println("===========================");
        /*
        Создать ещё одну мапу, обобщение целое число и строка,заполнить 10 значениями,
        ключ случайное число от 0 до 1000 а значение, название буквы этого случайного числа.
        Из первого удалить поля с соответствующими ключами второй мапы.
         */
        HashMap<Integer, String> hashMap1 = new HashMap<>(10);
        for (int i = 0; i < 10; i++) {
            int key = rand.nextInt(20);
            String value = Character.getName(key);
            hashMap1.put(key, value);
        }
        for (var item : hashMap1.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        System.out.println("================================");

        for (int i : hashMap1.keySet()) {
            if (hashMap.containsKey(i)) {
                hashMap.remove(i);
            }
        }

        for (var item : hashMap.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }

    }
}
/*
myHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
myHashMap
                .entrySet()                         // зайти во внутренности
                .stream()                           // превратить в поток
                .sorted(Map.Entry.comparingByValue()) // отсортировать по значению
                .forEach(System.out::println);      // вывести каждую пару значений
 */