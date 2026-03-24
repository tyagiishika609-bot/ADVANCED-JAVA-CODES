import java.util.*;
import java.util.stream.Collectors;
class LowertoUpperCase{
    public static void main(String[] args){
List<String> list = Arrays.asList("java", "python", "c");

List<String> result = list.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

System.out.println(result);
    }
}