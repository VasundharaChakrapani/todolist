package com.example.todolist.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;

private String name;
private LocalDate duDate;
public Task(){};

public Task(String name,LocalDate duDate){
    this.name=name;
    this.duDate=duDate;
}

//getters - shld be named according to attibutes

public Long getId(){
    return id;
}
public String getName(){
    return name;
}
public LocalDate getDueDate(){
    return duDate;
}

//setters

public void setName(String name){
    this.name=name;
}
public void setDueDate(LocalDate dueDate){
    this.duDate=dueDate;
}

    
}
