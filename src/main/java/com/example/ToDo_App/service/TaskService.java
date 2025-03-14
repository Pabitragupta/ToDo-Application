package com.example.ToDo_App.service;


import com.example.ToDo_App.model.Task;
import com.example.ToDo_App.respository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTask(){
        return taskRepository.findAll();
    }
}
