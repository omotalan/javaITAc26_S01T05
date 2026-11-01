package s105_n1_e01_e05_directori;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Helpers {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter
            .ofPattern("yyyy-MM-dd HH:mm:ss")
            .withZone(ZoneId.systemDefault());

    public static String getChangeDate(Path element) {
        try {
            FileTime time = Files.getLastModifiedTime(element);
            return DATE_FORMATTER.format(time.toInstant());
        } catch (IOException e) {
            return "Data de modificació desconeguda";
        }
    }
}
