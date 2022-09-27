package stream;

import util.Movie;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDemo {

    public static void main(String[] args) {

        List<Movie> movieList = Arrays.asList(
          new Movie("Movie1",2021,"A1",3),
                new Movie("Movie2",2022,"A2",4),
                new Movie("Movie2",2021,"A3",4)
        );

        //Get movie names alone
        List<String> moviesName = movieList.stream()
                .map(Movie::getName).collect(Collectors.toList());
        moviesName.forEach(System.out::println);

        //Avoiding duplicate movies
        Set<Integer> movieNameSet = movieList.stream()
                .map(Movie::getRating).collect(Collectors.toSet());
        movieNameSet.forEach(System.out::println);

        //Joining all movies in a string
        String movieNameJoin = movieList.stream().
                map(Movie::getName).collect(Collectors.joining(","));
        System.out.println(movieNameJoin);

        //Group movies based on year
        Map<Integer,List<Movie>> movieGroup = movieList.stream()
                .collect(Collectors.groupingBy(Movie::getReleaseYear));

        for (Map.Entry map : movieGroup.entrySet()){
            System.out.println(map.getKey()+ " "+map.getValue());
        }

        //Calculating the average rating
        Double movieAverage = movieList.stream()
                .collect(Collectors.averagingInt(Movie::getRating));
        System.out.println(movieAverage);

        // Split list of movie into 2 separate list based on criteria. eg: rating >= 4
       Map<Boolean,List<Movie>> movieRating =  movieList.stream()
                .collect(Collectors.partitioningBy(movie -> movie.getRating()>=4));
       for (Map.Entry map : movieRating.entrySet()){
           System.out.println(map.getKey()+" "+map.getValue());
       }
    }
}
