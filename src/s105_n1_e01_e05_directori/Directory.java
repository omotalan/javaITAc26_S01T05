package s105_n1_e01_e05_directori;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Directory {
    private String path;

    public Directory(String path) {
        this.path = path;
    }

    public void listDirectory(String path) {
        Path directori = Paths.get(path);

        try (Stream<Path> stream = Files.list(directori)) {
            stream.map(Path::getFileName)
                    .map(Path::toString)
                    .sorted(String::compareToIgnoreCase)
                    .forEach(System.out::println);

        } catch (IOException e) {
            System.err.println("Error en llegir el directori: " + e.getMessage());
        }
    }

    public String getPath() {
        return path;
    }
}
