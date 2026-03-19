import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Ant", "Ball", "Animal");

        long count = list.stream()
                         .filter(s -> s.startsWith("A"))
                         .count();

        System.out.println(count);
    }
}