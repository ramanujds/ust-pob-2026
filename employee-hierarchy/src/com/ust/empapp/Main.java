package com.ust.empapp;


import com.ust.empapp.model.Developer;
import com.ust.empapp.model.Employee;
import com.ust.empapp.model.Manager;

public class Main {
    public static void main(String []args) {
        Employee employee1 = new Manager(101,"Harsh",25000,10);
        Employee employee2 = new Developer(105,"Karan",65000,"Java");


        employee1.displayDetails();

        employee2.displayDetails();
    }
}
