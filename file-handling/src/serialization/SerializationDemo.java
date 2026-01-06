package serialization;

import java.io.*;

public class SerializationDemo {

    static void main() {

        // Write (Serialize)
//        try (OutputStream outputStream = new FileOutputStream("employee.ser");
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
//            Employee employee = new Employee(1, "Harsh", 60000);
//            objectOutputStream.writeObject(employee);
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        // Read (De-serialize)
        try(InputStream inputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        ) {
            Employee emp = (Employee) objectInputStream.readObject();
            System.out.println(emp);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
