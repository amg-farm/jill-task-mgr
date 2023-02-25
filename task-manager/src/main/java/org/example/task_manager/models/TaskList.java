package org.example.task_manager.models;

import java.util.List;

public class TaskList {
    private int id;
    private String user_name;
    private List<TaskListItem> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public List<TaskListItem> getItems() {
        return items;
    }

    public void setItems(List<TaskListItem> items) {
        this.items = items;
    }
}
