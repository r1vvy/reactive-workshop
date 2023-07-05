package streams;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
//        ReactiveSources.intNumbersFlux().subscribe(
//                System.out::println,
//                err -> System.err.println(err.getMessage()),
//                () -> System.out.println("Complete")
//        );

        // Subscribe to a flux using an implementation of BaseSubscriber
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }
    static class MySubscriber<T> extends BaseSubscriber<T> {
        @Override
        public void hookOnSubscribe(Subscription subscription) {
            System.out.println("Subscribe happened");
            request(1);
        }

        @Override
        protected void hookOnNext(T value) {
            System.out.println(value.toString() + " received");
            request(3);
        }

        @Override
        protected void hookOnComplete() {
            System.out.println("Completed");
        }
    }

}

// Backpressure control example
