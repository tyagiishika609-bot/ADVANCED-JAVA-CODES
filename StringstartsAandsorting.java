import java.util.*;
class StringstartsAandsorting{
    public static void main(String[] args){
List<String> list = Arrays.asList("Apple", "Banana", "Avocado", "Apricot", "Mango");

list.stream()
    .filter(s -> s.startsWith("A"))
    .sorted()
    .limit(3)
    .forEach(System.out::println);
    }
}