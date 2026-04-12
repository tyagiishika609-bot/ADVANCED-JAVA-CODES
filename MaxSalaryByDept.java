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

    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class MaxSalaryByDept {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
            new Employee("Ishika", "IT", 70000),
            new Employee("Aman", "IT", 90000),
            new Employee("Rahul", "HR", 50000),
            new Employee("Neha", "HR", 60000)
        );

        Map<String, Optional<Employee>> result = list.stream()
                .collect(Collectors.groupingBy(
                        e -> e.dept,
                        Collectors.maxBy(Comparator.comparing(e -> e.salary))
                ));

        result.forEach((dept, emp) ->
            System.out.println(dept + " : " + emp.get())
        );
    }
}