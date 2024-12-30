package com.api.simulation.model;

public class Record {
    private long id;
    private String name;

    public Record(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}