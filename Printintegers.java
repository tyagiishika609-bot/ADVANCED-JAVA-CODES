import java.util.*;

public class Printintegers{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70);

        list.stream()
            .limit(5)
            .forEach(System.out::println);
    }
}