package basics;

import java.io.*;
import java.util.Scanner;

public class ReadingFileDemo {

    static void main() {

        // Byte Stream - InputStream

//        try {
//            InputStream inputStream = new FileInputStream("hello.txt");
//            int ch;
//            while ((ch=inputStream.read())!= -1){
//                System.out.print((char) ch);
//            }
//        }
//        catch (Exception ex){
//            System.err.println(ex.getMessage());
//        }

        // Character Stream - Reader
        try (Reader fileReader = new FileReader("hello.txt")) {
                //            Scanner scanner = new Scanner(fileReader);
//            while (scanner.hasNext()) {
//                String line = scanner.nextLine();
//                System.out.println(line);
//            }

                BufferedReader reader = new BufferedReader(fileReader);
                reader.lines().filter(line -> line.toLowerCase().contains("java"))
                        .forEach(line -> System.out.println(line));

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }




}
