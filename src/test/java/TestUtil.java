import streams.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestUtil {
    public static <T> List<T> createList(T... elements) {
        return List.of(elements);
    }

    public static <T> List<T> createList(Stream<T> stream) {
        return stream.collect(Collectors.toList());
    }

    public static List<Integer> createIntegerList(int startInclusive, int endExclusive) {
        return IntStream.range(startInclusive, endExclusive)
                .boxed()
                .collect(Collectors.toList());
    }

    public static Stream<Integer> createIntegerStream(int startInclusive, int endExclusive) {
        return IntStream.range(startInclusive, endExclusive).boxed();
    }

    public static Stream<User> createUserStream(User... users) {
        return Stream.of(users);
    }
}
