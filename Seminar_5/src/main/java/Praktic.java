import java.util.*;

public class Praktic {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<Integer, String>() {
        };
        Map<Integer, String> copymap = new HashMap<>();
        map.put(1, "Germany");
        map.put(2, "Italy");
        map.put(3, "France");
        map.put(4, "Spain");
        map.put(5, "Russia");
        map.put(6, "China");
        map.put(7, "Japan");
        copymap.putAll(map);
        copymap.put(8, "Sweden");

            System.out.println(map);
        //System.out.println(copymap);
        //for(var item: map.entrySet())

            System.out.println(map.ceilingEntry(8));
        }


    }


