package funtionalinterface;

import util.Person;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPersonExample {

    static List<Person> personList = Person.getAllPerson();
    static BiConsumer<String,List<String>> hobbieList = (name,hobbie) -> {
        System.out.println("Name "+name+" /Hobbies "+hobbie);
    };

    static BiConsumer<String,Double> salaryList = (name,salary) -> {
        System.out.println("Name "+name+" /Salary "+salary);
    };

    public static void main(String[] args) {
        fetchHobbie();
        fetchSalary();
    }

    static void fetchHobbie(){
        personList.forEach((hobPerson) -> {
            hobbieList.accept(hobPerson.getName(),hobPerson.getHobbies());
        });
    }

    static void fetchSalary(){
        personList.forEach(person -> {
           salaryList.accept(person.getName(),person.getSalary());
        });
    }
}
