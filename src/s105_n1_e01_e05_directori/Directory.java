package s105_n1_e01_e05_directori;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static s105_n1_e01_e05_directori.Helpers.getChangeDate;

public class Directory {
    private String path;

    public Directory(String path) {
        this.path = path;
    }

    public static void writeRecursiveDirectoryToFile(String directoryPath, String outputPath) {
        Path directories = Paths.get(directoryPath);

        if (!Files.exists(directories) || !Files.isDirectory(directories)) {
            System.err.println("Error: La ruta especificada no és un directori vàlid.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
            formatDirectoryOutput(directories, writer);

            processDirectory(directories, 0, writer);

            System.out.println("Success! Directory tree saved to: " + outputPath);

        } catch (IOException e) {
            System.err.println("Error creating or writing to the output file: " + e.getMessage());
        }
    }

    private static void formatDirectoryOutput(Path directories, BufferedWriter writer) throws IOException {
        writer.write("Arbre de directoris per a: " + directories.toAbsolutePath());
        writer.newLine();
        writer.write("=".repeat(60));
        writer.newLine();
    }

    private static String processLevelItem(Path element, int level) {
        boolean isDirectory = Files.isDirectory(element);
        String type = isDirectory ? "[D]" : "[F]";
        String name = element.getFileName().toString();
        String changeDate = getChangeDate(element);

        String padding = "    ".repeat(level);

        return String.format("%s%s %-30s | Modificat: %s%n", padding, type, name, changeDate);
    }

    private static List<Path> orderItems(Path directori) {
        try (Stream<Path> stream = Files.list(directori)) {
            List<Path> ordered = stream
                    .sorted((p1, p2) -> p1.getFileName().toString()
                            .compareToIgnoreCase(p2.getFileName().toString()))
                    .collect(Collectors.toList());

            return ordered;
        } catch (IOException e) {
            System.err.println("Error en llegir el directori: " + directori.getFileName() + " - " + e.getMessage() + "]");
        }

        return Collections.emptyList();
    }

    private static void processDirectory(Path directori, int level, BufferedWriter writer) throws IOException {
            List<Path> ordered = orderItems(directori);

            for (Path element : ordered) {
                String fileLine = processLevelItem(element, level);
                writer.write(fileLine);
                writer.newLine();

                // If it's a directory, apply method recursively
                if (Files.isDirectory(element)) {
                    processDirectory(element, level + 1, writer);
                }
            }
    }

    public String getPath() {
        return path;
    }
}
