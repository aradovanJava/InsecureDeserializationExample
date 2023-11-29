package org.example;

import org.example.data.Animal;
import org.example.data.Person;
import org.example.exception.InsecureDeserializationException;
import org.example.serialization.WhiteList;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Optional;

public class Deserializer {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(Main.FILE_NAME)))
        {

            List<Object> listOfObjects = (List<Object>) ois.readObject();

            for(Object readObject : listOfObjects) {

                String className = readObject.getClass().getName();

                Optional<Object> securityCheckResult =
                        WhiteList.getWhiteListedClasses().stream()
                        .filter(c -> c.equals(className))
                        .findAny();

                if(securityCheckResult.isEmpty()) {
                    throw new InsecureDeserializationException("The class "
                        + className + " is not allowed to be deserialized!");
                }

                if(readObject instanceof Person p) {
                    System.out.println(p);
                }
                else if(readObject instanceof Animal a) {
                    System.out.println(a);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
