import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + "(" + salary + ")";
    }
}

public class PartitionExample {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
            new Employee("Ishika", 70000),
            new Employee("Rahul", 40000),
            new Employee("Aman", 80000)
        );

        Map<Boolean, List<Employee>> result = list.stream()
                .collect(Collectors.partitioningBy(e -> e.salary > 50000));

        System.out.println("Above 50K: " + result.get(true));
        System.out.println("Below 50K: " + result.get(false));
    }
}