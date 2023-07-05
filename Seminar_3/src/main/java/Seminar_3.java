/*
Дан произвольный список целых чисел.
1)  Нужно удалить из него четные числа.
2)  Найти минимальное значение.
3)  Найти макимальное значение.
4)  Найти среднее арифметическое.
 */

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Seminar_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int sizeList = in.nextInt();
        in.close();

        ArrayList<Integer> numbers = new ArrayList<>(sizeList);
        fillArrayList(numbers, sizeList);
        System.out.println(numbers + "\n");
        ArrayList<Integer> tmpList = new ArrayList<> (numbers);

        ListIterator<Integer> listIter =  tmpList.listIterator();
        while   (listIter.hasNext()) {
            if (isEven(listIter.next())) {
                listIter.previous();
                listIter.remove();
            }
        }
        System.out.println("Список без четных чисел:");
        System.out.println(tmpList + "\n");

        int minValue = minValueList(numbers);
        System.out.println("Минимальное значение исходного списка = " + minValue);
        int maxValue = maxValueList(numbers);
        System.out.println("Максимальное значение исходного списка = " + maxValue);
        double arithmeticMean = arithmeticMeanList(numbers);
        System.out.printf("Среднее арифметическое исходного списка = %.2f\n", arithmeticMean);


    }

    public static void fillArrayList(ArrayList<Integer> list, int size) {
        Random random = new Random();
        for (int i = 1; i <= size; i++) {
            list.add(random.nextInt(100) - 50);
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) return true;
        else return false;
    }

    public static int minValueList(ArrayList<Integer> list) {
        int min = list.get(0);
        for(int item:list) {
            if (item < min) min = item;
        }
        return min;
    }

    public static int maxValueList(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int item:list) {
            if (item > max) max = item;
        }
        return max;
    }

    public static double arithmeticMeanList(ArrayList<Integer> list) {
        int summa = 0;
        for(int item:list) {
            summa += item;
        }
        double result = (double) summa / list.size();
        return result;
    }
}