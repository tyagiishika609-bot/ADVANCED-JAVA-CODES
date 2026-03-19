import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10,12,14,15,17);

        list.stream()
            .filter(n -> n % 2 == 0)
            .skip(5)
            .forEach(System.out::println);
    }
}