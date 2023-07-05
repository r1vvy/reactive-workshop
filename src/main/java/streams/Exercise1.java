package streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {

    public Stream<Integer> secondAndThirdNumberGreaterThanFive(Stream<Integer> stream) {
        return stream.filter(number -> number > 5)
                .skip(1)
                .limit(2);
    }

    public Integer firstNumberGreaterThanFiveOrMinusOne(Stream<Integer> stream) {
        return stream
                .filter(n -> n > 5)
                .findFirst()
                .orElse(-1);
    }

    public Stream<String> firstNameOfUsers(Stream<User> stream) {
        return stream.map(User::getFirstName);
    }

    public Stream<String> firstNameOfUsersWithIds(Stream<User> userStream, Stream<Integer> idStream) {
        Set<Integer> idSet = idStream.collect(Collectors.toSet());

        return userStream
                .filter(user -> idSet.contains(user.getId()))
                .map(User::getFirstName);
    }
}
