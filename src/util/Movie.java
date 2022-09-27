package util;

public class Movie {

    public Movie(String name, Integer releaseYear, String actor, Integer rating) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.actor = actor;
        this.rating = rating;
    }

    String name;
    Integer releaseYear;
    String actor;
    Integer rating;

    public String getName() {
        return name;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public String getActor() {
        return actor;
    }

    public Integer getRating() {
        return rating;
    }

    public String toString(){
        return name+" "+releaseYear+" "+actor+" "+rating;
    }
}
