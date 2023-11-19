package com.example.eventsysem;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Events {
    private String id;
    private String description;
    private String capacity;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
