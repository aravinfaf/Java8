package funtionalinterface;

import util.Person;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPersonExample {

    static Predicate<Person> heightPredicate = person -> person.getHeight() > 130;
    static Predicate<Person> genderPredicate = person -> person.getGender().equalsIgnoreCase("male");

    static Function<List<Person>, Map<String,Double>> personDetails = list ->{
       Map<String,Double> map = new HashMap<>();

        list.forEach(person ->{
           if (heightPredicate.and(genderPredicate).test(person)){
               map.put(person.getName(), person.getSalary());
           }
        });
        return map;
    };

    public static void main(String[] args) {

        System.out.println(personDetails.apply(Person.getAllPerson()));

    }
}
