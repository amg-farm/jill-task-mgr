package org.example.task_manager.data;

import org.example.task_manager.models.TaskList;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TaskListRepository {
    List<TaskList> getAll();

    @Transactional
    TaskList findByID(int taskListId);

    TaskList add(TaskList list);

    boolean update(TaskList list);

    @Transactional
    boolean delete(int taskListId);

}
