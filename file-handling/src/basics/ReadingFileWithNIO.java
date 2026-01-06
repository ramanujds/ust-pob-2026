package basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingFileWithNIO {

    static void main() {
        Path path = Paths.get("hello.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(line -> System.out.println(line));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
