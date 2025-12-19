package oops;

public class Student extends Person {

    int id;
    String branch;

    public Student(int id, String name, int age, String branch){
        super(name,age);
        this.id=id;
        this.branch=branch;
    }

    public void saySomething(){
        System.out.println("I am learning java..");
    }

}
