package s105_n1_e01_e05_directori;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

public class Encryptor {

    private static final String ALGORITHM = "AES/CBC/PKCS5Padding";

    public static void encryptFile(String sourceFilePath, String destFilePath, String scr, String iv) {
        try {
            processFile(Cipher.ENCRYPT_MODE, sourceFilePath, destFilePath, scr, iv);
        } catch (IOException e) {
            System.err.println("I/O Error during processing: " + e.getMessage());
        } catch (GeneralSecurityException e) {
            System.err.println("Security Error during processing: " + e.getMessage());
        }
    }

    public static void decryptFile(String sourceFilePath, String destFilePath,String scr, String iv) {
        try {
            processFile(Cipher.DECRYPT_MODE, sourceFilePath, destFilePath, scr, iv);
        } catch (IOException e) {
            System.err.println("I/O Error during processing: " + e.getMessage());
        } catch (GeneralSecurityException e) {
            System.err.println("Security Error during processing: " + e.getMessage());
        }
    }

    private static CryptoSpecs generateSpecs(String scr, String iv) {
        SecretKey secretKey = new SecretKeySpec(scr.getBytes(StandardCharsets.UTF_8), "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8));

        return new CryptoSpecs(secretKey, ivSpec);
    }

    private static void transformBytes(Cipher cipher, String sourceFilePath, String destFilePath)  throws GeneralSecurityException, IOException  {
        // Read source bytes, transform them, and output to destination
        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destFilePath)) {

            byte[] inputBuffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(inputBuffer)) != -1) {
                byte[] outputBuffer = cipher.update(inputBuffer, 0, bytesRead);
                if (outputBuffer != null) {
                    fos.write(outputBuffer);
                }
            }

            byte[] outputBufferFinal = cipher.doFinal();
            if (outputBufferFinal != null) {
                fos.write(outputBufferFinal);
            }
        }
    }

    private static void processFile(int cipherMode, String sourceFilePath, String destFilePath, String scr, String iv) throws GeneralSecurityException, IOException {
        CryptoSpecs specs = generateSpecs(scr, iv);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(cipherMode, specs.secretKey(), specs.ivSpec());

        transformBytes(cipher, sourceFilePath, destFilePath);
    }
}
