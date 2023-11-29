package org.example;

import org.example.data.Animal;
import org.example.data.BadGuy;
import org.example.data.Person;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_NAME = "objects.ser";
    public static final String SERIALIZED_FILE_NAME = "newData.ser";

    public static void main(String[] args) {

        Animal firstAnimal = new Animal("Dog", "Čabraja", 17);
        Person newPerson = new Person("Mišo", "Kovač",
                LocalDate.now().minusMonths(10).minusYears(70)
                        .minusDays(3));
        BadGuy newBadGuyInTown = new BadGuy("Steve the Butcher");

        List<Object> classContainer = new ArrayList<>();
        classContainer.add(firstAnimal);
        classContainer.add(newPerson);
        classContainer.add(newBadGuyInTown);

        try (FileOutputStream fos = new FileOutputStream(new File(FILE_NAME));
             ObjectOutputStream oos = new ObjectOutputStream(fos))
        {
            oos.writeObject(classContainer);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}