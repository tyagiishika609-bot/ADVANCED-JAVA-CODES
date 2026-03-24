import java.util.*;
import java.util.stream.Collectors;

class Numbergreaterthan50 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 60, 30, 80, 90);

        List<Integer> result = list.stream()
                .filter(n -> n > 50)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}