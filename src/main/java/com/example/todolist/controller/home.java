package com.example.todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist.entity.Task;
import com.example.todolist.service.taskService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/task")
public class home {
private taskService service;
public home(taskService service){
    this.service=service;
}

    @GetMapping("/all")
    public List<Task> getMethodName() {
        return service.getAllTasks();   
    }

    @PostMapping("/add")
    public String addTask(@RequestBody Task task) {
        service.createTask(task);
        return ("Added task successfully");
    }

    @GetMapping("/{id}")
    public Optional<Task> getById(@PathVariable Long id) {
        return service.getTaskbyId(id);
    }

    @GetMapping("/name/{name}")
    public List<Task> getByName(@PathVariable String name){
        return service.getTaskbyName(name);
    }

    @GetMapping("/deadline/{dueDate}")
    public List<Task> getByDeadline(@PathVariable LocalDate dueDate) {
        return service.getTaskbyDueDate(dueDate);
    }
    
    


    

    
    
}
