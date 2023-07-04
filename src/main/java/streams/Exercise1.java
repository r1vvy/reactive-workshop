package streams;

import java.util.List;
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
        List<Integer> idList = idStream.toList();

        return userStream
                .filter(user -> idList.contains(user.getId()))
                .map(User::getFirstName);
    }
}
