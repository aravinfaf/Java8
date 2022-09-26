package funtionalinterface;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
       // c1.accept("Aravindkumar R");

        Consumer<String> c2 = (s) -> System.out.println(s.toLowerCase());
       // c2.accept("ARAVINDKUMAR R");

        // andThen -> Both input should be same type
        c1.andThen(c2).accept("Aravindkumar R");

    }
}
