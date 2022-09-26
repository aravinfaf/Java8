package funtionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

// Take 2 input params
public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println("Add "+(a+b));
        BiConsumer<Integer,Integer> biConsumerSubtract = (a,b) -> System.out.println("Sub "+(a- b));
        //biConsumer.accept(2,4);
        //biConsumerSubtract.accept(4,1);

        biConsumer.andThen(biConsumerSubtract).accept(10,5);

        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(1,2,3,4,5);

        BiConsumer<List<Integer>,List<Integer>> sizeCheck = (list1,list2) -> {
            if (list1.size() == list2.size()) {
                System.out.println("Equal");
            }else{
                System.out.println("Not equal");
            }
        };

        sizeCheck.accept(l1,l2);
    }
}
