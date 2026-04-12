import java.util.*;
import java.util.stream.*;

public class MostFrequent {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,3,3,4,4);

        int result = list.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();

        System.out.println("Most Frequent: " + result);
    }
}