import java.util.*;
import java.util.stream.Collectors;
class Numberdivisibleby3{
    public static void main(String[] args){
List<Integer> list = Arrays.asList(3, 5, 9, 10, 12);

List<Integer> result = list.stream()
        .filter(n -> n % 3 == 0)
        .collect(Collectors.toList());

System.out.println(result);
}
}