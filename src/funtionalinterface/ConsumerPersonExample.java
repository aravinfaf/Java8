package funtionalinterface;

import util.Person;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonExample {

   static List<Person> personList = Person.getAllPerson();

    static Consumer<Person> personConsumer = person  -> System.out.println(person);
    static Consumer<Person> personConsumerUpperCase = person  -> System.out.println(person.getName().toUpperCase());

    public static void main(String[] args) {
        //personList.forEach(personConsumer);
        //personList.forEach(personConsumerUpperCase);

        //personList.forEach(personConsumer.andThen(personConsumerUpperCase));

        printWithCondition();
    }

    static void printWithCondition(){
        personList.forEach(person -> {
            if (person.getGender().equalsIgnoreCase("male") && person.getHeight() > 160){
                personConsumer.andThen(personConsumerUpperCase).accept(person);
            }
        });
    }
}
