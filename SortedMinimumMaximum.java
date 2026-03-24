import java.util.*;
public class SortedMinimumMaximum{
    public static void main(String[] args){
        List<Integer> l1 = List.of(34,56,78,81,92,98);
        // List<Integer> l2 = l1.stream().sorted(Comparator.reverseOrder()).toList();
        List<Integer> l2 = l1.stream().sorted((x,y)->y.compareTo(x)).toList();
        int minimum =l1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(l2);
        System.out.println(minimum);
        int maximum =l1.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(maximum);
    }
}