package model;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Todo {
    private String title;
    private String description;
    private boolean done;
    private Date due;
    private long id;

    public Todo(long identity, String task_title, String desc, boolean status, Date due_date) {
        id = identity;
        title = task_title;
        description = desc;
        done = status;
        due = due_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        String task = "{";
        task = task + "\"id\":" + id + ",";
        task = task + "\"title\":\"" + title + "\",";
        task = task + "\"description\":\"" + description + "\",";
        if (due != null)
            task = task + "\"due\":\"" + new SimpleDateFormat("yyyy-MM-dd").format(due) + "\"";
        task = task + "}";
        Gson gson = new Gson();
        return gson.toJson(this);
    }

}
