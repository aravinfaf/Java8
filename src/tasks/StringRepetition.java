package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringRepetition {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names = Arrays.asList("a","b","c","c","v","b","a","b","b","a");

        Map<String,Long> map = names.stream().collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting()));

        map.forEach((name,count) ->{
            System.out.println(name+ " - "+count);
        });
    }
}
