package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Hello World");
        System.out.println(result);
    }
}
