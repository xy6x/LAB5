package com.example.trachker.Task;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Task {
    private String ID;
    private  String title;
    private  String description;
    private  String status;

}
