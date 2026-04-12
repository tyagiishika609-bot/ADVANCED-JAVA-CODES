import java.util.*;
import java.util.stream.*;

public class Sortlimit {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Aman", "Avocado", "Banana");

        list.stream()
            .filter(s -> s.startsWith("A"))
            .sorted()
            .limit(3)
            .forEach(System.out::println);
    }
}