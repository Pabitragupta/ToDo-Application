package com.example.ToDo_App.controller;


import com.example.ToDo_App.model.Task;
import com.example.ToDo_App.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTask();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
