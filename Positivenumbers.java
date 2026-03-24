import java.util.*;
import java.util.stream.Collectors;
class Positivenumbers{
    public static void main(String[] args){

List<Integer> list = Arrays.asList(-10, 25, 5, 30, 50);

List<Integer> result = list.stream()
        .filter(n -> n > 20)
        .collect(Collectors.toList());

System.out.println(result);
    }
}