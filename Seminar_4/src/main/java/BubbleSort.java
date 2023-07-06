import java.util.Random;
import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(10);
        ArrayList<Integer> id = new ArrayList<>(10);
        ArrayList<Integer> gender = new ArrayList(10);

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100));
            id.add(numbers.size() - 1);
            gender.add(random.nextInt(0,2));   //0 - женщина, 1 - мужчина
        }
        System.out.println(numbers);
        System.out.println(id);
        System.out.println(gender);
        for (int i = 0; i < id.size(); i++) {
            for (int j = 0; j < id.size() - 1 - i; j++ ) {
                if ((numbers.get(id.get(j)) > numbers.get(id.get(j+1))) ||
                    ((numbers.get(id.get(j)) == numbers.get(id.get(j+1))) &&
                    (gender.get(id.get(j)) > (gender.get(id.get(j+1)))))) {
                    int tmp = id.get(j);
                    id.set(j, id.get(j+1));
                    id.set(j+1, tmp);
                }
            }
        }
        for(int item:id)
            System.out.print(numbers.get(item) + " ");
        System.out.println();
        for(int item:id)
            System.out.printf("%d ",gender.get(item));

    }
}