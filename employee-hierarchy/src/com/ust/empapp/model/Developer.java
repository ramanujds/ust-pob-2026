package com.ust.empapp.model;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(int employeeId, String name, double salary, String programmingLanguage) {
        super(employeeId, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language : "+programmingLanguage);
    }


}
