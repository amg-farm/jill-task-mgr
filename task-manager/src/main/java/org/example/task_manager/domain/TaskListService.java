package org.example.task_manager.domain;

import org.example.task_manager.data.TaskListItemRepository;
import org.example.task_manager.data.TaskListRepository;
import org.example.task_manager.models.TaskList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListService {
    private final TaskListRepository taskListRepository;
    private final TaskListItemRepository taskListItemRepository;

    public TaskListService(TaskListRepository taskListRepository, TaskListItemRepository taskListItemRepository) {
        this.taskListRepository = taskListRepository;
        this.taskListItemRepository = taskListItemRepository;
    }

    public List<TaskList> getAll() {
        return taskListRepository.getAll();
    }
}
