import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        list.stream()
            .limit(5)
            .forEach(System.out::println);
    }
}