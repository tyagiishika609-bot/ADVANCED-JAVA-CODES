import java.util.*;
import java.util.stream.*;

public class ReplaceSum{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-5, 10, -3, 20);

        int sum = list.stream()
                      .map(n -> n < 0 ? 0 : n)
                      .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}