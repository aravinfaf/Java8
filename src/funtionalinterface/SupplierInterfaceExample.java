package funtionalinterface;

import util.Person;

import java.util.List;
import java.util.function.Supplier;

public class SupplierInterfaceExample {

    //No input params required. But return what you are given as expected
    static Supplier<List<Person>> supplier1 = () -> Person.getAllPerson();
    static Supplier<Person> supplier2 = () -> Person.getPerson();
    static Supplier<Double> supplier3 = () -> Math.random();

    public static void main(String[] args) {
        System.out.println("All Data : "+supplier1.get());
        System.out.println("Single Data : "+supplier2.get());
        System.out.println(supplier3.get());
    }
}
