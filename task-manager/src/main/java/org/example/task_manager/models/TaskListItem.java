package org.example.task_manager.models;

import java.sql.Date;

public class TaskListItem {
    private int id;
    private String item_name;
    private Date date;
    private boolean item_complete;
    private boolean item_deleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isItem_complete() {
        return item_complete;
    }

    public void setItem_complete(boolean item_complete) {
        this.item_complete = item_complete;
    }

    public boolean isItem_deleted() {
        return item_deleted;
    }

    public void setItem_deleted(boolean item_deleted) {
        this.item_deleted = item_deleted;
    }
}
