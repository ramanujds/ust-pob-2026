package sets;

import sorting.Employee;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    static void main(String[] args) {

        class EmployeeCompareByName implements Comparator<Employee> {

            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        }

        var comp = new EmployeeCompareByName();
        Set<Employee> set = new TreeSet<>(comp);


        Employee e1 = new Employee(1,"Harsh",60000);
        Employee e2 = new Employee(10,"Javed",70000);
        Employee e3 = new Employee(5,"Amit",65000);
        Employee e4 = new Employee(5,"Amit",65000);
        Employee e5 = new Employee(5,"Amit",75000);

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);


        for (var item:set){
            System.out.println(item);
        }


    }

}
