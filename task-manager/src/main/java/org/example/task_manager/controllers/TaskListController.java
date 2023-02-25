package org.example.task_manager.controllers;

import org.example.task_manager.domain.TaskListService;
import org.example.task_manager.models.TaskList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins={"http://localhost:3000"})
@RequestMapping("/api/tasklist")
public class TaskListController {
    private final TaskListService service;

    public TaskListController(TaskListService service) {
        this.service = service;
    }

    @GetMapping
    public List<TaskList> findAll() {
        return service.getAll();
    }
}
