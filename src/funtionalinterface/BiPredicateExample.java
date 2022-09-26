package funtionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate = (a,b) -> a>50 && b>40;

        boolean biPredicateResult = biPredicate.test(10,20);
        System.out.println(biPredicateResult );
    }
}
