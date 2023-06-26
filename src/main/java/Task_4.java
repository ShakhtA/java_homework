// Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        int i = new Random().nextInt(Short.MAX_VALUE);
        System.out.println("i = " + i);

        int n = new Random().nextInt(Short.MAX_VALUE);
        System.out.println("n = " + n);

        int size2 = (Short.MAX_VALUE - i) - ((Short.MAX_VALUE / n) - (i / n)) + 1;
        int[] m2 = new int[size2];

        int k = -1;
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n != 0)
                m2[++k] = j;
        }

        System.out.printf("Некратные %d числа, лежащие в диапазноне от %d до %d:\n", n, i, Short.MAX_VALUE);
        for (int j = 0; j < size2; j++) {
            if ((j+1) % 25 == 0) {
                System.out.println(m2[j]);
                //System.out.println();
            } else System.out.print(m2[j] + " ");
        }
        System.out.println();
    }
}