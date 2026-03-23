import java.util.*;

public class Longeststring {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Programming", "Code");

        String longest = list.stream()
                             .reduce("", (a, b) -> 
                                 a.length() > b.length() ? a : b);

        System.out.println("Longest string: " + longest);
    }
}