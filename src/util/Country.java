package util;

public class Country {

    public Country(String name, String country) {
        this.name = name;
        this.country = country;
    }

    String name;
    String country;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
