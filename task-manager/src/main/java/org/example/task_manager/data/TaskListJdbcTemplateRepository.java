package org.example.task_manager.data;

import org.example.task_manager.models.TaskList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskListJdbcTemplateRepository implements TaskListRepository{
    @Override
    public List<TaskList> getAll() {
        return null;
    }

    @Override
    public TaskList findByID(int taskListId) {
        return null;
    }

    @Override
    public TaskList add(TaskList list) {
        return null;
    }

    @Override
    public boolean update(TaskList list) {
        return false;
    }

    @Override
    public boolean delete(int taskListId) {
        return false;
    }
}
