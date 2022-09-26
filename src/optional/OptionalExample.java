package optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<Object> empty = Optional.empty();

        Optional<String> name = Optional.of("name"); // Non-nullable type. if pass null throws exception

        Optional<String> name1 = Optional.ofNullable("name1"); // Nullable type

        System.out.println("empty : "+empty);
        System.out.println("of : "+name);
        System.out.println("nullable : "+name1);
    }
}
