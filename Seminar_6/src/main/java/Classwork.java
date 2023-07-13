import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Classwork {

    public static void main(String[] args) {
        MySet<Integer> newSet = new MySet();
        System.out.println(newSet.isEmpty());
        System.out.println(newSet.add(777));
        System.out.println(newSet.add(888));
        System.out.println(newSet.add(999));
        System.out.println(newSet.remove(999));
        System.out.println(newSet.toString());
        /*
        System.out.println(newSet.toString());
        Iterator<Integer> iter = newSet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
         */
        //System.out.println(newSet.get(3));
    }
}

class MySet<T> {
    private HashMap<T, Object> map = new HashMap<>();
    private static final Object OBJ = new Object();

    public boolean add(T value) {
        return map.put(value, OBJ) == null;
    }

    public boolean remove(T value) {
        return map.remove(value) != null;
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public String toString() {
        return map.keySet().toString();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }
}
