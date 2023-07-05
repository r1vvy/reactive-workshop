package streams;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {
        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(
                System.out::println,
                err -> System.err.println(err.getMessage()),
                () -> System.out.println("Complete")
        );

        // Get the value from the Mono into an integer variable, but blocking isnt reactive programming.
//        var number = ReactiveSources.intNumberMono().block();
//        System.out.println(number);


        System.out.println("Press a key to end");
        System.in.read();
    }
}
