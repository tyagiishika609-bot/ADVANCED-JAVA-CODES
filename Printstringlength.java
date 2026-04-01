import java.util.*;

public class Printstringlength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "Spring", "Code", "Developer");

        list.stream()
            .filter(s -> s.length() > 4)
            .limit(3)
            .forEach(System.out::println);
    }
}