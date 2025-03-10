package com.example.ToDo_App.controller;


import com.example.ToDo_App.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;


}
