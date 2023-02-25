package org.example.task_manager.data;

import org.example.task_manager.models.TaskListItem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskListItemJdbcTemplateRepository implements TaskListItemRepository{
    @Override
    public List<TaskListItem> findByListId(int listId) {
        return null;
    }

    @Override
    public TaskListItem findById(int itemId) {
        return null;
    }

    @Override
    public TaskListItem add(TaskListItem item) {
        return null;
    }

    @Override
    public boolean update(TaskListItem item) {
        return false;
    }

    @Override
    public boolean deleteById(int itemId) {
        return false;
    }
}
