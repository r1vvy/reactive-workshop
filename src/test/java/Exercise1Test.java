import org.junit.jupiter.api.Test;
import streams.Exercise1;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise1Test {
    private final Exercise1 exercise1 = new Exercise1();

    @Test
    protected void shouldReturn_SecondAndThirdNumberGreaterThanFive() {
        var stream = TestUtil.createIntegerStream(1, 10);

        var result = exercise1.secondAndThirdNumberGreaterThanFive(stream)
                .toList();

        assertEquals(TestUtil.createList(7, 8), result);
    }

    @Test
    protected void shouldReturn_FirstNumberGreaterThanFive() {
        var stream = TestUtil.createIntegerStream(1, 10);

        var result = exercise1.firstNumberGreaterThanFiveOrMinusOne(stream);

        assertEquals(6, result);
    }

    @Test
    protected void shouldReturn_MinusOne() {
        var stream = TestUtil.createIntegerStream(1, 6);

        var result = exercise1.firstNumberGreaterThanFiveOrMinusOne(stream);

        assertEquals(-1, result);
    }

    @Test
    protected void shouldReturn_FirstNameOfUsers() {
        var stream = StreamSources.userStream();

        var result = exercise1.firstNameOfUsers(stream);

        assertEquals(TestUtil.createList("Lionel",
                "Cristiano",
                "Diago",
                "Zinedine",
                "Jurgen",
                "Gareth"
        ), result.collect(Collectors.toList()));
    }

    @Test
    protected void shouldReturn_FirstNameOfUsersWithIds() {
        var userStream = StreamSources.userStream();
        var idStream = TestUtil.createIntegerStream(1, 11);

        var result = exercise1.firstNameOfUsersWithIds(userStream, idStream);

        assertEquals(List.of("Lionel",
                "Cristiano",
                "Diago",
                "Zinedine",
                "Jurgen",
                "Gareth"
        ), result.toList());
    }

}
