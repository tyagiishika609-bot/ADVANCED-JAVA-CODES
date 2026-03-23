import java.util.*;

 class Reducecount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int count = list.stream()
                        .map(e -> 1)
                        .reduce(0, (a, b) -> a + b);

        System.out.println("Count: " + count);
    }
}