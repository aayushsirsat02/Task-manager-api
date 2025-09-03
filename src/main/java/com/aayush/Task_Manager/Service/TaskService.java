package com.aayush.Task_Manager.Service;

import com.aayush.Task_Manager.Models.Task;
import com.aayush.Task_Manager.Repos.TaskRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {


    private final TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


   public List<Task> getAllTasks(){
        return taskRepository.findAll();

   }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> getOneTaskById(Long id){
        return taskRepository.findById(id);
    }

    public void deleteTaskById(Long id){
        taskRepository.deleteById(id);
    }

    //for update
    public Task UpdateTaskById(Long id, Task updatedTask){
        return taskRepository.findById(id).map(task -> {
            task.setTitle(updatedTask.getTitle());
            task.setDescription(updatedTask.getDescription());
            task.setCompleted(updatedTask.isCompleted());
            return taskRepository.save(task);
        }).orElseThrow(() -> new RuntimeException("Task not found"));
    }
}
