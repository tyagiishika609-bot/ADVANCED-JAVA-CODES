import java.util.*;

public class Lambda4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 9, 1, 7);

        Collections.sort(list, (a, b) -> b - a);

        System.out.println(list);
    }
}