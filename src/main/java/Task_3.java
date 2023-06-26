//  Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1


import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        int i = new Random().nextInt(Short.MAX_VALUE);
        System.out.println("i = " + i);

        int n = new Random().nextInt(Short.MAX_VALUE);
        System.out.println("n = " + n);

        int size1 = (Short.MAX_VALUE / n) - (i / n);
        int[] m1 = new int[size1];

        int k = -1;
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0)
                m1[++k] = j;
        }

        if (k < 0) System.out.printf("Чисел, кратных %d, лежащих в диапазоне от %d до %d нет\n", n, i, Short.MAX_VALUE);
        else {
            System.out.printf("Кратные %d числа, лежащие в диапазноне от %d до %d:\n", n, i, Short.MAX_VALUE);
            for (int j = 0; j < size1; j++) {
                System.out.print(m1[j] + " ");
            }
        }
        System.out.println();
    }
}