package com.api.simulation.service;

import com.api.simulation.model.Record;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecordService {
    public List<Record> getRecords(int page, int size) {
        List<Record> records = new ArrayList<>();
        int start = page * size;
        int end = start + size;

        for (int i = start; i < end; i++) {
            records.add(new Record(i, "Record-" + i));
        }

        return records;
    }
}
