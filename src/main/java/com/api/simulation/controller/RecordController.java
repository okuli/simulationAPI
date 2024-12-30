package com.api.simulation.controller;


import com.api.simulation.model.Record;
import com.api.simulation.service.RecordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecordController {
    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/api/records")
    public List<Record> getRecords(
            @RequestParam("page") int page,
            @RequestParam("size") int size
    ) {
        return recordService.getRecords(page, size);
    }
}
