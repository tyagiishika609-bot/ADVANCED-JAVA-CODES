import java.util.*;
import java.util.stream.*;

public class Distinctuppercase {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "java", "stream", "api");

        list.stream()
            .distinct()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}