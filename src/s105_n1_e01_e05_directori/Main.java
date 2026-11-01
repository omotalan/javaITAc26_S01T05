package s105_n1_e01_e05_directori;

import static s105_n1_e01_e05_directori.Directory.printRecursiveDirectory;
import static s105_n1_e01_e05_directori.Directory.writeRecursiveDirectoryToFile;
import static s105_n1_e01_e05_directori.DirectorySer.deserializeObject;
import static s105_n1_e01_e05_directori.DirectorySer.serializeObject;

public class Main {

    public static void main(String[] args) {
        String ruta = "./";
        String rutaEscritura = "output.txt";
        StringBuilder output = printRecursiveDirectory(ruta);
        writeRecursiveDirectoryToFile(output, rutaEscritura);

        String rutaSer = "output.ser";
        serializeObject(output, rutaSer);
        StringBuilder deserOutput = (StringBuilder) deserializeObject(rutaSer);
        System.out.println(deserOutput);
    }
}
