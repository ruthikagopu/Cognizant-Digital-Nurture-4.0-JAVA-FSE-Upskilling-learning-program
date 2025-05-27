import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Before sorting: " + fruits);

        Collections.sort(fruits, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("After sorting: " + fruits);
    }
}
