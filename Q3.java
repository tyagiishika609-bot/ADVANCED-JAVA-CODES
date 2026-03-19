import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "spring", "api", "react");

        list.stream()
            .filter(s -> s.length() > 4)
            .limit(3)
            .forEach(System.out::println);
    }
}