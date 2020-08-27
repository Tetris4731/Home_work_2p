package src.home_worl_3p;

import java.util.*;

public class Main {
    public static void main( String[] args ) {
//        int count = 0;
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add ("Ivanov");
//        arr.add ("Kozlov");
//        arr.add ("Sidorov");
//        arr.add ("Bazarin");
//        arr.add ("Deushev");
//        arr.add ("Ivanov");
//        arr.add ("Kozlov");
//        arr.add ("Sidorov");
//        arr.add ("Bazarin");
//        arr.add ("Deushev");
//        arr.add ("Ivanov");
//        arr.add ("Kozlov");
//        arr.add ("Sidorov");
//        arr.add ("Bazarin");
//        arr.add ("Deushev");
//        arr.add ("Ivanov");
//        arr.add ("Kozlov");
//        arr.add ("Sidorov");
//        arr.add ("Bazarin");
//        arr.add ("Deushev");
//        HashSet set = new HashSet(arr);
//        System.out.println("keywords " + set);
//        System.out.println("number of keywords " + set.size());
    Map<String, String> map = new HashMap<>();
        map.put("Kozlov", "89656794404");
        map.put("ivanov", "89656764404");
        map.put("Sidorov", "89654794404");
        map.put("Kozlov", "89656784404");
        map.put("ivanov", "89651794404");
        map.put("Sidorov", "89656794404");
        map.put("Kozlov", "89656760404");
        map.put("ivanov", "89612794404");
        map.put("Sidorov", "89656444404");
        map.put("Kozlov", "89656794554");
        for (String s : map.keySet()) {
            System.out.println("Second name: " + s);
            System.out.println("telefon number " + map.get(s));
        }
        List<String> values = new ArrayList<>(map.values());
        System.out.println(values);

        System.out.println(map.get("Kozlov"));
    }
}
