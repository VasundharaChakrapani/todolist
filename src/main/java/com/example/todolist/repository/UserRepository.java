package com.example.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todolist.entity.Task;
import java.util.List;
import java.time.LocalDate;



@Repository
public interface UserRepository extends JpaRepository<Task,Long> {
    //findbyId already exists
    List<Task> findByDuDate(LocalDate dueDate);
    List<Task> findByName(String name);

    
}
