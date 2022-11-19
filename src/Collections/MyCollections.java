package Collections;

import java.util.*;

public class MyCollections {
    public static void main(String[] args) {
        System.out.println("List");
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mandarin");
        fruits.add("Orange");
        fruits.add("Apple");
        System.out.println(fruits);

        List<String> fruits2 = new LinkedList<String>();
        fruits2.add("Apple");
        fruits2.add("Mandarin");
        fruits2.add("Orange");
        fruits2.add("Apple");
        System.out.println(fruits2);

        System.out.println("Set");
        Set<String> fruits3 = new HashSet<String>();
        fruits3.add("Apple");
        fruits3.add("Mandarin");
        fruits3.add("Orange");
        fruits3.add("Apple");
        System.out.println(fruits3);

        Set<String> fruits4 = new LinkedHashSet<>();
        fruits4.add("Apple");
        fruits4.add("Mandarin");
        fruits4.add("Orange");
        fruits4.add("Apple");
        System.out.println(fruits4);

        Set<String> fruits5 = new TreeSet<>();
        fruits5.add("Apple");
        fruits5.add("Mandarin");
        fruits5.add("Orange");
        fruits5.add("Apple");
        System.out.println(fruits5);

        System.out.println("Map");
        Map<String, Integer> fruits6 = new HashMap<>();
        fruits6.put("Apple", 5);
        fruits6.put("Mandarin", 8);
        fruits6.put("Orange", 6);
        fruits6.put("Apple", 7);
        System.out.println(fruits6);

        Map<String, Integer> fruits7 = new LinkedHashMap<>();
        fruits7.putIfAbsent("Apple", 5);
        fruits7.putIfAbsent("Mandarin", 8);
        fruits7.putIfAbsent("Orange", 6);
        fruits7.putIfAbsent("Apple", 7);
        System.out.println(fruits7);

        Map<String, Integer> fruits8 = new TreeMap<>();
        fruits8.put("Apple", 5);
        fruits8.put("Mandarin", 8);
        fruits8.put("Orange", 6);
        fruits8.put("Apple", 7);
        System.out.println(fruits8);
    }
}
