package funtionalinterface;

import util.Person;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceBiFunctionExample {

    // 2 input params(1st & 2nd) & last param return type
    static BiFunction<String,String,String> bf1 = (string1,string2) -> string1+string2;

    static Predicate<Person> heightPredicate = person -> person.getHeight() > 130;
    static Predicate<Person> genderPredicate = person -> person.getGender().equalsIgnoreCase("male");

    static BiFunction<List<Person>, Predicate<Person>, Map<String,Double>> f1 = (list,predicate) -> {
        Map<String, Double> map = new HashMap<>();

        list.forEach(person -> {
            if (predicate.test(person)) {
            map.put(person.getName(), person.getSalary());
            }
        });
        return map;
    };



    public static void main(String[] args) {
        System.out.println(bf1.apply("java8 ","features"));

        System.out.println(f1.apply(Person.getAllPerson(),heightPredicate.and(genderPredicate)));
    }
}
