package com.example.lab4;

import org.springframework.web.bind.annotation.*;
import studentController.StudCon;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/student")
public class Student {
    ArrayList<StudCon> stu = new ArrayList<>();
    @GetMapping("/get")
    public ArrayList<StudCon> getTasks() {

        return stu;
    }

    @PostMapping("/add")
    public ArrayList<StudCon> addTask(@RequestBody StudCon task) {
        stu.add(task);
        return stu;
    }
    @GetMapping("/check/{index}")
    public  boolean getStatus(@PathVariable int index){
        if (stu.get(index).getStatus().equalsIgnoreCase("graduated")) {
            return false;
        }else
            return true;
    }
    @GetMapping("/name/{index}")

    public String getName(@PathVariable int index){

        return stu.get(index).getName();
    }
    @GetMapping("/age/{index}")
    public  int getAge(@PathVariable int index){
        return stu.get(index).getAge();
    }
    @GetMapping("/college/{index}")
    public String getCollege(@PathVariable int index){

        return stu.get(index).getCollege();
    }


}
