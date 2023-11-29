package org.example.serialization;

import org.example.data.Animal;
import org.example.data.Person;

import java.util.ArrayList;
import java.util.List;

public class WhiteList {

    private static List<Object> whiteListedClasses;

    static {

        whiteListedClasses = new ArrayList<>();
        whiteListedClasses.add(Animal.class.getName());
        whiteListedClasses.add(Person.class.getName());

    }

    public static List<Object> getWhiteListedClasses() {
        return whiteListedClasses;
    }
}
