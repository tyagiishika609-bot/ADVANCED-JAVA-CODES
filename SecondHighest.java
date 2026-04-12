import java.util.*;
import java.util.stream.*;

public class SecondHighest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 50, 30, 80, 70);

        int secondHighest = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Highest: " + secondHighest);
    }
}