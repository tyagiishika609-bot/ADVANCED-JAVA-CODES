import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String dept;
    int salary;

    Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class GroupByDeptCount {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
            new Employee("Ishika", "IT", 70000),
            new Employee("Rahul", "HR", 40000),
            new Employee("Aman", "IT", 80000),
            new Employee("Neha", "HR", 60000),
            new Employee("Rohit", "Sales", 30000)
        );

        Map<String, Long> result = list.stream()
                .collect(Collectors.groupingBy(
                        e -> e.dept,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}