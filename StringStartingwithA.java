import java.util.*;
import java.util.stream.Collectors;
class StringStartingwithA{
    public static void main(String[] args){

List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Mango");

List<String> result = list.stream()
        .filter(s -> s.startsWith("A"))
        .collect(Collectors.toList());

System.out.println(result);
    }
}