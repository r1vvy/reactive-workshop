package streams;

import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // will be blocked, because it will wait for the intNumbersFlux to be retrieved.
        var numbers = ReactiveSources.intNumbersFlux()
                .toStream()
                .toList();

        System.out.println("List" + numbers);
        System.out.println("Size: " + numbers.size());

        System.out.println("Press a key to end");
        System.in.read();
    }
}
