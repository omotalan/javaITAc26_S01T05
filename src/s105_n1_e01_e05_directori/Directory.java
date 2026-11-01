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

    public static StringBuilder printRecursiveDirectory(String directoryPath) {
        Path directories = Paths.get(directoryPath);

        if (!Files.exists(directories) || !Files.isDirectory(directories)) {
            System.err.println("Error: La ruta especificada no és un directori vàlid.");
        }

        StringBuilder output = new StringBuilder();

        String header = formatDirectoryOutput(directories);
        output.append(header).append(System.lineSeparator());

        int startingLevel = 0;
        buildDirectoryStringRecursively(directories, startingLevel, output);

        System.out.println("Directory tree saved in memory. Make sure you either save it into a file or serialize it.");
        return output;
    }

    private static void buildDirectoryStringRecursively(Path currentDir, int level, StringBuilder output) {
        List<Path> ordered = orderItems(currentDir);

        for (Path element : ordered) {
            String fileLine = processLevelItem(element, level);
            output.append(fileLine).append(System.lineSeparator());

            if (Files.isDirectory(element)) {
                buildDirectoryStringRecursively(element, level + 1, output);
            }
        }
    }

    public static void writeRecursiveDirectoryToFile(StringBuilder output, String outputPath) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath))) {
            writer.write(output.toString());
            System.out.println("Success! Directory tree saved to: " + outputPath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static String formatDirectoryOutput(Path directories) {
        String title = String.format("Arbre de directoris per a: " + directories.toAbsolutePath() + "\n");
        String underline = "=".repeat(60);

        return title+underline;
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

    public static void readAndPrintFile(String filePath) {
        Path path = Paths.get(filePath);
        if (!Files.exists(path) || !Files.isDirectory(path)) {
            System.err.println("Error: El fitxer especificat no existeix.");
            return;
        }

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
            System.out.println("--- EOF ---");
        } catch (IOException e) {
            System.err.println("Error al llegir el fitxer: " + e.getMessage());
        }
    }

    public String getPath() {
        return path;
    }
}
