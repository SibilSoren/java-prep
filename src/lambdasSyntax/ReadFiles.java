package lambdasSyntax;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ReadFiles {
    static void main() throws IOException {
        List<String> fileNames = List.of("file-a.txt", "file-b.txt", "file-c.txt");

        // Imperative way of writing the code
        for (String fileName : fileNames) {
            for (String line : Files.readAllLines(Paths.get(fileName),
                    StandardCharsets.UTF_8)) {
                System.out.println(line);
            }
        }

        // Functional way of writing the code
        Stream.of("file-a.txt", "file-b.txt", "file-c.txt")
                .map(Path::of)
                .map(p -> {
                    try {
                        return Files.readAllLines(p, StandardCharsets.UTF_8);
                    } catch (IOException e) {
                        return List.of();
                    }
                })
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
