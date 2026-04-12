import java.util.*;
import java.util.stream.*;

public class Filterlimit {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "StreamAPI", "Code", "Programming");

        list.stream()
            .filter(s -> s.length() > 4)
            .limit(3)
            .forEach(System.out::println);
    }
}