import java.util.*;
import java.util.stream.*;

public class Removeduplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shyam", "ram", "mohan");

        names.stream()
             .distinct()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}