import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = List.of(
            () -> "Result from Task 1",
            () -> "Result from Task 2",
            () -> "Result from Task 3"
        );

        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> future : results) {
            System.out.println("Received: " + future.get());
        }

        executor.shutdown();
    }
}
