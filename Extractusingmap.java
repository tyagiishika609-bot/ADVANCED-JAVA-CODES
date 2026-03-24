import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Extractusingmap{
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student(1, "Aman"),
            new Student(2, "Riya"),
            new Student(3, "Karan")
        );

        List<String> names = list.stream()
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}