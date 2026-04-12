import java.util.*;
import java.util.stream.*;

public class Sumeven {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);

        int sum = list.stream()
                      .filter(n -> n % 2 == 0)
                      .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of even numbers: " + sum);
    }
}