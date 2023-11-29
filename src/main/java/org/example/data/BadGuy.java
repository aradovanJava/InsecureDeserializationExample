package org.example.data;

import java.io.Serializable;

public class BadGuy implements Serializable {

    private String name;

    public BadGuy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
