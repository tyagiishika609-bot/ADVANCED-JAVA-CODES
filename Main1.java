import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int attendance;

    Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student("A", 70),
            new Student("B", 55),
            new Student("C", 80)
        );

        List<Student> pass = list.stream()
                .filter(s -> s.attendance > 60)
                .collect(Collectors.toList());

        List<Student> fail = list.stream()
                .filter(s -> s.attendance <= 60)
                .collect(Collectors.toList());

        System.out.println("Pass: " + pass.size());
        System.out.println("Fail: " + fail.size());
    }
}