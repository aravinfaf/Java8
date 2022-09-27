package stream;

import util.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountryStreams {

    public static void main(String[] args) {
        List<Country> list = populateCountries();
        System.out.println("-------obtain US and non US based persons using partitioningBy & GroupingBy---------");

        System.out.println(list.stream()
                .collect(Collectors.partitioningBy(country -> country.getCountry().equalsIgnoreCase("us"))));

        System.out.println();

        System.out.println(list.stream().collect(Collectors.groupingBy(country -> country.getCountry().equalsIgnoreCase("US"))));

        System.out.println();

        System.out.println("-------count US and Non US based person using partitioningBy and GroupingBy--------");
        System.out.println(list.stream().collect(
                Collectors.partitioningBy(country -> country.getCountry().equalsIgnoreCase("india")
               , Collectors.counting())));

        System.out.println(list.stream().collect(
                Collectors.groupingBy(country -> country.getCountry().equalsIgnoreCase("india"),
                        Collectors.counting())));

        System.out.println("--------obtain the persons in each country and count them using groupBy------");
        System.out.println(list.stream().collect(
                Collectors.groupingBy(Country::getCountry)));


        System.out.println(list.stream().collect(
                Collectors.groupingBy(country -> country.getCountry(),Collectors.counting())));

        System.out.println("--------obtain US and non US based person using partitioningBy & map names to uppercase using maps-----");
        System.out.println( list.stream().collect(
                Collectors.partitioningBy(country -> country.getCountry().equalsIgnoreCase("US"),
                        Collectors.mapping(
                                country -> country.getCountry().toUpperCase(),
                                Collectors.toList()
                        ))));

        System.out.println("-------Obtain the persons in each country using groupingBy & map names to upper case using maps-----");
        System.out.println(list.stream().collect(
                Collectors.groupingBy(
                        country -> country.getCountry(),Collectors.mapping(
                                country -> country.getCountry().toUpperCase(),Collectors.toList()
                        )
                )
        ));
    }

    static List<Country> populateCountries(){
        List<Country> l1 = new ArrayList<>();
        l1.add(new Country("p1","US"));
        l1.add(new Country("p2","US"));
        l1.add(new Country("p3","Brazil"));
        l1.add(new Country("p4","US"));
        l1.add(new Country("p5","Germany"));
        l1.add(new Country("p7","India"));
        l1.add(new Country("p6","US"));
        l1.add(new Country("p8","India"));

        return l1;
    }
}
