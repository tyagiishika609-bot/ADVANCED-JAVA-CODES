import java.util.*;

public class Concatenateallstrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Java", "World");

        String result = list.stream()
                            .reduce("", (a, b) -> a + " " + b);

        System.out.println(result.trim());
    }
}