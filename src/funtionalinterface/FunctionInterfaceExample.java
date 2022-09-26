package funtionalinterface;

import java.util.function.Function;

public class FunctionInterfaceExample {

    // Integer input(1st param), String output(2nd param)
    static Function<Integer,String> stringFunction = (age) ->
    {
        if(age > 18) {
            return "Vote";
        }else{
            return "Nope";
        }
    };

    static Function<String,String> f1 = string -> string.toUpperCase();
    static Function<String,String> f2 = string -> string.toUpperCase().concat("features");

    static Function<Integer,Integer> f3 = x -> x*2; // x = 10 -> 10*2 =20
    static Function<Integer,Integer> f4 = x -> x*x; // 20 -> 20*20

    static Function<String,String> ide = Function.identity();

    public static void main(String[] args) {
        System.out.println(stringFunction.apply(2));

        // left to right order
        System.out.println("AndThen "+f1.andThen(f2).apply("java8 "));

        //Right to left order (Reverse order)
        System.out.println("Compose "+f1.compose(f2).apply("java8 "));

        //Normal order
        System.out.println("AndThen "+f3.andThen(f4).apply(10));

        //Reverse order
        System.out.println("Compose "+f3.compose(f4).apply(10));

        //input and output param are same returns same
        System.out.println(ide.apply("java8"));
    }
}
