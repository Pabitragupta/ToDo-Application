package com.example.ToDo_App.respository;

import com.example.ToDo_App.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
