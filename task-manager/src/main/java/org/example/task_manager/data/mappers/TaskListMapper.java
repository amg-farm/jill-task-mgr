package org.example.task_manager.data.mappers;

import org.example.task_manager.models.TaskList;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskListMapper implements RowMapper<TaskList> {
    @Override
    public TaskList mapRow(ResultSet resultSet, int i) throws SQLException {
        TaskList list = new TaskList();
        list.setId(resultSet.getInt("id"));
        list.setUser_name(resultSet.getString("user_name"));
        return list;
    }
}
