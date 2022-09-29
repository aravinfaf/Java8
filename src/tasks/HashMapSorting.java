package tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSorting {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("d", 4);
        map.put("A", 10);
        map.put("B", 2);
        map.put("F", 3);
        map.put("D", 2);
        map.put("a", 1);
        map.put("c", 0);

        System.out.println(map);

        Map<String, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));

        System.out.println(result);
    }
}
