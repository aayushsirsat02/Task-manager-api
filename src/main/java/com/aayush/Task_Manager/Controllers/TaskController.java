package com.aayush.Task_Manager.Controllers;

import com.aayush.Task_Manager.Models.Task;
import com.aayush.Task_Manager.Service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {



    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteTaskById(@PathVariable Long id){
        taskService.deleteTaskById(id);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("{id}")
    public ResponseEntity<Task> updateTaskById(@PathVariable Long id,@RequestBody Task task){
        try {
            return ResponseEntity.ok(taskService.UpdateTaskById(id,task));
        } catch (RuntimeException e) {
            return  ResponseEntity.notFound().build();
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return taskService.getOneTaskById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
