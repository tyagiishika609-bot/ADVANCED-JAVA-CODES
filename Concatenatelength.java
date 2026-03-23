import java.util.*;

public class Concatenatelength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "API", "Stream", "Code");

        String result = list.stream()
                            .filter(s -> s.length() > 3)
                            .reduce("", (a, b) -> a + " " + b);

        System.out.println(result.trim());
    }
}