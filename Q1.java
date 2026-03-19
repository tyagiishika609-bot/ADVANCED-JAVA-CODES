import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "alice", "john", "bob");

        names.stream()
             .distinct()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}