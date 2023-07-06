import java.util.Random;
import java.util.ArrayList;

public class SelectSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        ArrayList<Integer> id = new ArrayList<>(10);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(30));
            id.add(numbers.size() - 1);
        }

        System.out.println(numbers);

        for(int i = 0; i < id.size() - 1; i++) {
            int maxIdx = 0;
            for (int j = 1; j < id.size() - i; j++) {
                if (numbers.get(id.get(maxIdx)) < numbers.get(id.get(j))) {
                    maxIdx = j;
                }
            }
            if (maxIdx != id.size() - i) {
                int tmp = id.get(maxIdx);
                id.set(maxIdx, id.get(id.size() - 1 - i));
                id.set(id.size() - 1 - i, tmp);
            }
        }

        for(int item:id)
            System.out.print(numbers.get(item) + " ");
        System.out.println();
    }
}