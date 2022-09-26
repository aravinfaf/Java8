package funtionalinterface;

import util.Person;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicatePersonExample {

    static List<Person> personList = Person.getAllPerson();
    static BiPredicate<Integer, String> genderPredicate = (height, gender) ->
            height > 130 && gender.equalsIgnoreCase("male");

    public static void main(String[] args) {

        personList.forEach(person -> {
                    if (genderPredicate.test(person.getHeight(), person.getGender())) {
                        System.out.println(person);
                    }
                }
        );
    }
}
