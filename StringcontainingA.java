import java.util.*;
import java.util.stream.Collectors;
class StringcontainingA{
    public static void main(String[] args){

List<String> list = Arrays.asList("Apple", "Banana", "Cat", "Dog");

List<String> result = list.stream()
        .filter(s -> s.contains("A") || s.contains("a"))
        .collect(Collectors.toList());

System.out.println(result);
    }
}