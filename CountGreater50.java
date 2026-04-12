import java.util.*;
import java.util.stream.*;

public class CountGreater50 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 60, 80, 30);

        long count = list.stream()
                         .filter(n -> n > 50)
                         .count();

        System.out.println(count);
    }
}