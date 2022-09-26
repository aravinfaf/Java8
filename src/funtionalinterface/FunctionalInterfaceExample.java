package funtionalinterface;

import util.Person;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

    static Predicate<Person> heightPredicate = (person) -> person.getHeight() > 130;
    static Predicate<Person> genderPredicate = (person) -> person.getGender().equalsIgnoreCase("male");
    static BiPredicate<Integer,String> heightGender = (height,gender)-> height > 130 && gender.equalsIgnoreCase("male");
    static BiConsumer<String, List<String>> hobbies = (name,hobbies) -> {
        System.out.println("Name "+ name+ "/Hobby "+hobbies);
    };
    static Consumer<Person> personConsumer = person -> {
//      if (heightPredicate.and(genderPredicate).test(person))
      if (heightGender.test(person.getHeight(), person.getGender()))
        {
          hobbies.accept(person.getName(), person.getHobbies());
      }
    };

    public static void main(String[] args) {
        List<Person> personList = Person.getAllPerson();
        personList.forEach(personConsumer);
    }
}
