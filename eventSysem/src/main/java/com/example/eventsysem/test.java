package com.example.eventsysem;

import com.fasterxml.jackson.annotation.JsonFormat;
import jdk.jfr.Event;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("api/v1/event")
public class test {
    ArrayList<Events> ev = new ArrayList<>();
    @GetMapping("/get")

    public ArrayList<Events> get() {
        return ev;
    }
    @PostMapping("/add")
    public ArrayList<Events> addEvent(@RequestBody Events evn) {

        ev.add(evn);
        return ev;
    }
    @PutMapping("/pus/{index}")

    public ArrayList<Events> pusUpdate(@RequestBody Events evn, @PathVariable int index) {
        ev.set(index, evn);
        return ev;
    }
    @DeleteMapping("/delete/{index}")
    public ArrayList<Events> deleteEvent(@PathVariable int index) {
        ev.remove(index);
        return ev;
    }
    @GetMapping("/search/{evn}")
    public Events search(@PathVariable String evn) {

        for (Events e : ev) {
            if (e.getId().equalsIgnoreCase(evn)) {
                return e;

            }
        }
       return null;
    }
    @JsonFormat
public  ArrayList<Events>  date(){


  return ev;
}

}
