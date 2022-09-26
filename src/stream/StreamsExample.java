package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {
        filterExample();
        mapExample();
        flatMapExample();
    }

    private static void filterExample(){
        List<ProductModel> list = new ArrayList<ProductModel>();

        list.add(new ProductModel("Aravind","Men"));
        list.add(new ProductModel("Santhiya","Women"));
        list.add(new ProductModel("Tom","Dog"));
        list.add(new ProductModel("Ragul","Men"));

        List<String> filterResult = list.stream()
                .filter(product ->
                    product.getProductType().equalsIgnoreCase("Men"))
                .map(ProductModel::getProductName)
                .collect(Collectors.toList());

        System.out.println(filterResult);
    }

    private static void mapExample(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> mapResult = list.stream()
                .map(x -> x*2)
                .collect(Collectors.toList());
        System.out.println(mapResult);
    }
    private static void flatMapExample(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<Integer> flatMapResult = list.stream()
                .flatMap(x -> Stream.of(x,x*2))
                .collect(Collectors.toList());
        System.out.println(flatMapResult);
    }
}
