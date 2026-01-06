package basics;

import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

public class WritingToFileDemo {

    static void main() {

       try(Writer writer = new FileWriter("hello.txt",true)){
            writer.append("\nwe love India");
       }
       catch (Exception ex){

       }

    }

}
