package streams;

import java.io.IOException;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        // For the demo, this is still blocked.
        ReactiveSources.intNumbersFlux().subscribe(System.out::println);

        ReactiveSources.userFlux().subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
