package oops;

public class Employee extends Person {

    int id;
    double salary;

    public Employee(int id, String name, int age, double salary){
        super(name,age);
        this.id=id;
        this.salary=salary;
    }

    public void saySomething(){
        System.out.println("Hello from Jakarta...");
    }

}
