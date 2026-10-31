package s105_n1_e01_e05_directori;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static s105_n1_e01_e05_directori.Helpers.getChangeDate;

public class Directory {
    private String path;

    public Directory(String path) {
        this.path = path;
    }

    public static void listRecursiveDirectory(String path) {
        Path directories = Paths.get(path);

        if (!Files.exists(directories) || !Files.isDirectory(directories)) {
            System.err.println("Error: La ruta especificada no és un directori vàlid.");
            return;
        }

        System.out.println("Arbre de directoris per a: " + directories.toAbsolutePath());
        processDirectory(directories, 0);
    }

    private static void processDirectory(Path directori, int level) {

        try (Stream<Path> stream = Files.list(directori)) {
            // 1. Ordered items
            List<Path> ordered = stream
                    .sorted((p1, p2) -> p1.getFileName().toString()
                            .compareToIgnoreCase(p2.getFileName().toString()))
                    .collect(Collectors.toList());

            // 2. Process each item in each level
            for (Path element : ordered) {
                boolean isDirectory = Files.isDirectory(element);
                String type = isDirectory ? "[D]" : "[F]";
                String name = element.getFileName().toString();
                String changeDate = getChangeDate(element);

                String padding = "    ".repeat(level);

                System.out.printf("%s%s %-30s | Modificat: %s%n", padding, type, name, changeDate);

                // 3. If it's a directory, apply method recursively
                if (isDirectory) {
                    processDirectory(element, level + 1);
                }
            }

        } catch (IOException e) {
            System.err.println("Error en llegir el directori: " + directori.getFileName() + " - " + e.getMessage() + "]");
        }
    }

    public String getPath() {
        return path;
    }
}
