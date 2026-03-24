import java.util.*;
import java.util.stream.Collectors;
class Stringlengthh{
    public static void main(String[] args){

List<String> list = Arrays.asList("Apple", "Banana", "Mango", "Strawberry");

List<String> result = list.stream()
        .filter(s -> s.length() > 5)
        .collect(Collectors.toList());

System.out.println(result);
    }
}