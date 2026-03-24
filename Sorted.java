import java.util.*;
public class Sorted{
    public static void main(String[] args){
        List<Integer> l1 = List.of(34,56,78,81,92,98);
        // List<Integer> l2 = l1.stream().sorted(Comparator.reverseOrder()).toList();
        List<Integer> l2 = l1.stream().sorted((x,y)->y.compareTo(x)).toList();
        System.out.println(l2);
    }
}