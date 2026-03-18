import java.util.*;

public class Lambda2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "c++");

        list.forEach(s -> System.out.println(s.toUpperCase()));
    }
}