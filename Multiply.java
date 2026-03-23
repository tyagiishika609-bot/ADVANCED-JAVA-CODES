import java.util.*;

public class Multiply {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int product = list.stream()
                          .filter(n -> n % 2 != 0)
                          .reduce(1, (a, b) -> a * b);

        System.out.println("Product of odd numbers: " + product);
    }
}