package s105_n1_e01_e05_directori;

import static s105_n1_e01_e05_directori.Directory.writeRecursiveDirectoryToFile;

public class Main {

    public static void main(String[] args) {
        String ruta = "./";
        String rutaEscritura = "output.txt";
        writeRecursiveDirectoryToFile(ruta, rutaEscritura);
    }
}
