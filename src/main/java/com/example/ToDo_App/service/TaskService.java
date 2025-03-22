package com.example.ToDo_App.service;

import com.example.ToDo_App.model.Task;
import com.example.ToDo_App.respository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    // Get all Todos
    public List<Task> getAllTodos() {
        return taskRepository.findAll();
    }



    //Add new Task
    public Task addTask(String title){
        Task task = new Task();
        task.setTitle(title);
        task.setComplete(false);
        return taskRepository.save(task);
    }



    //Toggle the completion status of a task
    public Task toggleCompleted(Long id){
        Optional<Task> taskOptional = taskRepository.findById(id);

        if(taskOptional.isPresent()){
            Task task = taskOptional.get();
            task.setComplete(!task.isComplete());
            return taskRepository.save(task);
        }

        return null;
    }



    //Delete a task
    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
}
