import java.util.*;
import java.util.stream.Collectors;
class OddNumbers{
    public static void main(String[] args){

List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

List<Integer> result = list.stream()
        .filter(n -> n % 2 != 0)
        .collect(Collectors.toList());

System.out.println(result);
    }
}