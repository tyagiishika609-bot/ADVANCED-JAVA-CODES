import java.util.*;

public class Maximumreduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 5, 40);

        int max = list.stream()
                      .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        System.out.println("Max: " + max);
    }
}