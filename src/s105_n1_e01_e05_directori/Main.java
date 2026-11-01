package s105_n1_e01_e05_directori;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static s105_n1_e01_e05_directori.Directory.printRecursiveDirectory;
import static s105_n1_e01_e05_directori.Directory.writeRecursiveDirectoryToFile;
import static s105_n1_e01_e05_directori.DirectorySer.deserializeObject;
import static s105_n1_e01_e05_directori.DirectorySer.serializeObject;

public class Main {

    public static void main(String[] args) {
        Properties config = new Properties();

        try (FileInputStream fis = new FileInputStream("config.properties")) {
            config.load(fis);
        } catch (IOException e) {
            System.err.println("No s'ha pogut llegir el fitxer de configuració: " + e.getMessage());
            return;
        }

        String ruta = config.getProperty("ruta");
        String rutaEscritura = config.getProperty("rutaEscritura");
        String rutaSer = config.getProperty("rutaSer");
        String encryptedFilePath = config.getProperty("encryptedFilePath");
        String decryptedFilePath = config.getProperty("decryptedFilePath");

        // Print to file
        StringBuilder output = printRecursiveDirectory(ruta);
        writeRecursiveDirectoryToFile(output, rutaEscritura);

        // Serialize/Deserialize
        serializeObject(output, rutaSer);
        StringBuilder deserOutput = (StringBuilder) deserializeObject(rutaSer);
        System.out.println(deserOutput);

        // Encrypt/Decrypt
        String secretKeyStr = config.getProperty("crypto.secretKey");
        String ivStr = config.getProperty("crypto.iv");

        Encryptor.encryptFile(rutaEscritura, encryptedFilePath, secretKeyStr, ivStr);
        System.out.println("File successfully encrypted to: " + encryptedFilePath);

        Encryptor.decryptFile(encryptedFilePath, decryptedFilePath, secretKeyStr, ivStr);
        System.out.println("File successfully decrypted back to: " + decryptedFilePath);
    }
}