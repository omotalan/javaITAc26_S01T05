package s105_n1_e01_e05_directori;

import java.io.*;

public class DirectorySer implements Serializable {
    public static void serializeObject(Object object, String fileDestination) {
        try (FileOutputStream fileOut = new FileOutputStream(fileDestination);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(object);
            System.out.println("Success! Object successfully serialized to: " + fileDestination);

        } catch (IOException e) {
            System.err.println("Serialization Error: " + e.getMessage());
        }
    }

    public static Object deserializeObject(String fileSource) {
        try (FileInputStream fileIn = new FileInputStream(fileSource);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            Object deserializedObj = objectIn.readObject();
            System.out.println("Success! Object successfully deserialized from: " + fileSource);
            return deserializedObj;

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization Error: " + e.getMessage());
            return null;
        }
    }
}
