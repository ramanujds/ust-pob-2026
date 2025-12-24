package sorting;

import java.util.*;

public class SortingCollection {

    static void main() {

        List<Integer> list = Arrays.asList(10, 5, 20, 50, 30, 40);

        Collections.sort(list);

        System.out.println(list);

        List<String> names = Arrays.asList("Kavi", "Akash", "Deepak", "Chandana", "Gokul");


        Collections.sort(names);

        System.out.println(names);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Harsh",60000));
        employees.add(new Employee(10,"Javed",70000));
        employees.add(new Employee(5,"Amit",65000));

       // Collections.sort(employees);

        for (var emp:employees){
            System.out.println(emp);
        }


    }

}
