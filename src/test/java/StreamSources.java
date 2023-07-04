import streams.User;

import java.util.stream.Stream;

public class StreamSources {

    public static Stream<String> stringNumbersStream() {
        return Stream.of("one", "two", "three", "four", "five", "six", "seven");
    }

    public static Stream<Integer> intNumbersStream() {
        return java.util.stream.Stream.iterate(0, i -> i + 2)
                .limit(10);
    }

    public static Stream<User> userStream() {
        return java.util.stream.Stream.of(
                new User(1, "Lionel", "Messi"),
                new User(2, "Cristiano", "Ronaldo"),
                new User(2, "Diago", "Maradona"),
                new User(4, "Zinedine", "Zidane"),
                new User(5, "Jurgen", "Klinsmann"),
                new User(6, "Gareth", "Bale")
        );
    }
}
