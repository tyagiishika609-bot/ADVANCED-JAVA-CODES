import java.util.*;
import java.util.stream.*;

public class Productwithreduce {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4);

        int product = list.stream()
                          .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product);
    }
}