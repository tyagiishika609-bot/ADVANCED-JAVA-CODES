import java.util.*;
class Doubleoddnumbers{
    public static void main(String[] args){
List<Integer> list = Arrays.asList(1,2,3,4,5);

int sum = list.stream()
        .filter(n -> n % 2 != 0)
        .map(n -> n * 2)
        .reduce(0, Integer::sum);

System.out.println(sum);
    }
}