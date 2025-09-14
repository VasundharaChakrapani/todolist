package com.example.todolist.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.todolist.entity.Task;
import com.example.todolist.repository.UserRepository;

@Service
public class taskService {
    private UserRepository ur;

    public taskService(UserRepository ur){
        this.ur=ur;
    }
   
    //create or update tasks
    public String createTask(Task task){
        if(task.getDueDate()==null){
            task.setDueDate(LocalDate.now());
        }
        ur.save(task);
        return ("Task saved successfully");
    }

    //get all tasks
    public List<Task> getAllTasks(){
        return ur.findAll();
    }

    //get task by id
    public Optional<Task> getTaskbyId(Long id){
        return ur.findById(id);
    }

    public List<Task> getTaskbyDueDate(LocalDate duDate){
        return ur.findByDuDate(duDate);
    }

    public List<Task> getTaskbyName(String name){
        return ur.findByName(name);
    }
    
}
