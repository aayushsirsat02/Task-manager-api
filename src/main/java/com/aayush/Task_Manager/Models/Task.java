package com.aayush.Task_Manager.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    private boolean completed = false;

    private LocalDateTime ld = LocalDateTime.now();








    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getLd() {
        return ld;
    }

    public void setLd(LocalDateTime ld) {
        this.ld = ld;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }






}
