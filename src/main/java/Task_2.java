// Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Integer number = new Random().nextInt(2001);
        System.out.println("Cлучайное выпавшее число = " + number);

        String strNumber = Integer.toBinaryString(number);
        System.out.println("Двоичное представление случайно выпавшего числа" + number + " : " + strNumber);
        int n = strNumber.length();
        System.out.println(("Номер старшего значащего бита выпавшего числа: " + strNumber.length()));




    }
}