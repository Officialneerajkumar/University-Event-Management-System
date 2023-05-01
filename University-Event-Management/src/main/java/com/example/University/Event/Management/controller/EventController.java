package com.example.University.Event.Management.controller;

import com.example.University.Event.Management.model.Event;
import com.example.University.Event.Management.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/UMS")
public class EventController {

    @Autowired
    private ManagementService iService;


    @PostMapping("/add-event")
    public String addEvent(@RequestBody Event event){
        iService.addEvent(event);
        return "Hey, your task addEvent has been completed !";
    }

    @PutMapping("/update-event/eventId/{eventId}")
    public String updateEvent(@RequestBody Event event,@PathVariable int eventId){
        iService.updateEvent(eventId,event);
        return "Hey, your task updateEvent has been completed !";
    }

    @DeleteMapping("/delete-event/eventId/{eventId}")
    public String deleteEvent(@PathVariable int eventId){
        iService.deleteEvent(eventId);
        return "Hey, your task deleteEvent has been completed !";
    }

    @GetMapping("/get-all-event")
    public List<Event> getAllEvent(){
        return iService.getAllEvent();
    }
}
