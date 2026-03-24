import java.util.*;
import java.util.stream.Collectors;
class StringendingwithA{
    public static void main(String[] args){

List<String> list = Arrays.asList("LARA", "JAVA", "CODE", "DATA");

List<String> result = list.stream()
        .filter(s -> s.endsWith("A"))
        .collect(Collectors.toList());

System.out.println(result);
    }
}
