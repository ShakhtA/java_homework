// Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        int number = new Random().nextInt(2001);
        System.out.println("number = " + number);
    }
}