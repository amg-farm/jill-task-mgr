package org.example.task_manager.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins={"http://localhost:3000"})
@RequestMapping("/api/tasklistitems")
public class TaskListItemController {
}
