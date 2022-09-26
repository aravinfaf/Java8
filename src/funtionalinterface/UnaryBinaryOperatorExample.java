package funtionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperatorExample {

    static UnaryOperator<String> u1 = str -> str.toUpperCase();
    static UnaryOperator<Integer> u2 = x -> x*x;

    //Binary operator takes comparator as input, So first create comparator
    static Comparator<Integer> comp = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(u1.apply("java8"));
        System.out.println(u2.apply(10));

        BinaryOperator binaryOperator = BinaryOperator.maxBy(comp);
        System.out.println("Binary Operator MaxBy : "+ binaryOperator.apply(100,20));

        BinaryOperator binaryOperator1 = BinaryOperator.minBy(comp);
        System.out.println("Binary Operator MinBy : "+ binaryOperator1.apply(100,20));

    }

}
