package funtionalinterface;

import util.Person;

import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonExample {

    static Predicate<Person> heightPredicate = person -> person.getHeight() > 120;
    static Predicate<Person> genderPredicate = person -> person.getGender().equalsIgnoreCase("male");

    public static void main(String[] args) {

        List<Person> personList = Person.getAllPerson();

        personList.forEach(person -> {
            if (heightPredicate.and(genderPredicate).test(person)){
                System.out.println(person);
            }
        });

    }
}
