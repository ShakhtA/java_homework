import java.util.*;

public class Homework {
    public static void main(String[] args) {
        NewSet<Integer> map = new NewSet<>();
        System.out.println(map.put(111));
        System.out.println(map.remove(7777));
        System.out.println(map.put(222));
        System.out.println(map.put(333));
        System.out.println(map.toString());
        Iterator<Integer> iter = map.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(map.get(3));

    }
}

class NewSet<T> {
    private HashMap<T, Object> mySet = new HashMap<>();
    private final Object OBJ = new Object();

    public boolean put(T value) {

        return mySet.put(value, OBJ) == null;
    }

    public boolean remove(T value) {
        return mySet.remove(value, OBJ);
    }


    public String toString() {
        return mySet.keySet().toString();
    }

    public Iterator<T> iterator() {
        return mySet.keySet().iterator();
    }

    public T get(int value) {
        Object[] values = mySet.keySet().toArray();
        if (value < values.length)
            return (T) values[value];
        return null;
    }
}