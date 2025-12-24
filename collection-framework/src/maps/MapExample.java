package maps;

import sorting.Employee;

import java.util.HashMap;
import java.util.Map;

public class MapExample  {

    static void main(String[] args) {

        Map<Integer, Employee> employees = new HashMap<>();

        Employee e1 = new Employee(1,"Harsh",60000);
        Employee e2 = new Employee(10,"Javed",70000);
        Employee e3 = new Employee(5,"Amit",65000);
        Employee e4 = new Employee(1,"Lokesh",85000);


        employees.put(e1.getId(), e1);
        employees.put(e2.getId(), e2);
        employees.put(e3.getId(), e3);
        employees.put(e4.getId(), e4);


        for (int key:employees.keySet()){
            System.out.println(employees.get(key));
        }

//        for (Map.Entry<Integer,Employee> entry:employees.entrySet()){
//            System.out.println(entry.getValue());
//        }





    }

}
