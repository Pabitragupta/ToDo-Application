package com.example.ToDo_App.controller;


import org.springframework.ui.Model;
import com.example.ToDo_App.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping
    public String index(Model model) {
        model.addAttribute("tasks", taskService.getAllTodos());
        return "index";
    }


    @PostMapping("/add")
    public String add(@RequestParam String title){
        taskService.addTask(title);
        return "redirect:/";
    }


    @PostMapping("/toggleComplete/{id}")
    public String toggleComplete(@PathVariable Long id) {
        taskService.toggleCompleted(id);
        return "redirect:/";
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        taskService.deleteTask(id);
        return "redirect:/";
    }
}
