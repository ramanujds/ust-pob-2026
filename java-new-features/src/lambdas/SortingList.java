package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


public class SortingList {

    static void main() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Harsh", 250000));
        employees.add(new Employee(102, "Aditi", 180000));
        employees.add(new Employee(105, "Rohan", 320000));
        employees.add(new Employee(104, "Meera", 210000));
        employees.add(new Employee(103, "Kabir", 275000));

        Collections.sort(employees, (e1,e2) -> e1.id()-e2.id());

//        for (var e:employees){
//            System.out.println(e);
//        }

        employees.forEach(e -> System.out.println(e));


        // Comparator
        // Function
        // Predicate
        // Consumer
        // Supplier
        // Runnable

    }

}
