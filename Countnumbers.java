import java.util.*;
class Countnumbers{
public static void main(String[] args){

List<Integer> list = Arrays.asList(10, 60, 30, 80, 90);

long count = list.stream()
        .filter(n -> n > 50)
        .count();

System.out.println(count);
}
}