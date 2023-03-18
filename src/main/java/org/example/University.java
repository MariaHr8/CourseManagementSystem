package org.example;

public class University {
    String id, name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
