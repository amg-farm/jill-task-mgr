package org.example.task_manager.data;

import org.example.task_manager.models.TaskListItem;

import java.util.List;

public interface TaskListItemRepository {
    List<TaskListItem> findByListId(int listId);

    TaskListItem findById(int itemId);

    TaskListItem add(TaskListItem item);

    boolean update(TaskListItem item);

    boolean deleteById(int itemId);
}
