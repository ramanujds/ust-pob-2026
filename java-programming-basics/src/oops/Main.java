package oops;

public class Main {



    static void main() {



        Person person;

        person = new Student(1,"Harsh",25,"CSE");

        person.saySomething();

        person = new Employee(1,"Harsh",25,55000);

        person.saySomething();




    }
}
