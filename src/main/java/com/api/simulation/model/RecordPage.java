package com.api.simulation.model;

import java.util.List;

public class RecordPage {
    private List<Record> records;

    public RecordPage(List<Record> records) {
        this.records = records;
    }

    public List<Record> getRecords() {
        return records;
    }
}