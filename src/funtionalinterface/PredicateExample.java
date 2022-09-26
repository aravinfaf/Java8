package funtionalinterface;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> predicateGreaterThan = a -> a>10;
        boolean predicateGreaterThanresult = predicateGreaterThan.test(5);

        Predicate<Integer> predicateLessThan = a -> a<10;
        boolean predicateLessThanresult = predicateLessThan.test(5);

        Predicate<Integer> predicateEquals = a -> a==10;
        boolean predicateEqualsresult = predicateEquals.test(5);

//        System.out.println("Greater than : "+ predicateGreaterThanresult);
//        System.out.println("Less than : "+ predicateLessThanresult);
//        System.out.println("EqualsTo than : "+ predicateEqualsresult);

        System.out.println("And : "+predicateGreaterThan.and(predicateLessThan).test(20));
        System.out.println("Or : "+predicateGreaterThan.or(predicateLessThan).test(20));
        System.out.println("Equals : "+predicateGreaterThan.and(predicateEquals).test(11));

    }
}
