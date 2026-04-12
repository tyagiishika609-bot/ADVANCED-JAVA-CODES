import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Usingallfunctions {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
            new Employee("Ishika", 70000),
            new Employee("Rahul", 40000),
            new Employee("Aman", 80000),
            new Employee("Ishika", 90000),
            new Employee("Neha", 60000)
        );

       
        List<Employee> topEmployees = list.stream()
                .filter(e -> e.salary > 50000)                
                .collect(Collectors.toMap(
                        e -> e.name,                        
                        e -> e,
                        (e1, e2) -> e1.salary > e2.salary ? e1 : e2
                ))
                .values()
                .stream()
                .sorted((e1, e2) -> e2.salary - e1.salary)   
                .limit(3)                                    
                .collect(Collectors.toList());

       
        System.out.println("Top Employees:");
        topEmployees.forEach(e -> 
            System.out.println(e.name.toUpperCase() + " - " + e.salary)
        );

        
        int totalSalary = topEmployees.stream()
                .map(e -> e.salary)
                .reduce(0, Integer::sum);

        System.out.println("Total Salary of Top 3: " + totalSalary);
    }
}