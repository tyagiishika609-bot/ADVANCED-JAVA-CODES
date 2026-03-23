import java.util.*;

public class Replacenegativenumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-1, 2, -3, 4, 5);

        int sum = list.stream()
                      .map(n -> n < 0 ? 0 : n)
                      .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);
    }
}