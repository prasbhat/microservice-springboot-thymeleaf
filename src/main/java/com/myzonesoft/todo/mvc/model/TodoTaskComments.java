package com.myzonesoft.todo.mvc.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.time.LocalDate;

@SuppressWarnings("unused")
public class TodoTaskComments {
    /**
     * Unique Identifier for the To-do task Comments
     */
    private Long todoTaskCommentsId;

    private String taskComments;
    private LocalDate creationDate;

    @JsonBackReference
    private Tasks todoTask;

    //Constructors

    /**
     * Default Constructor without any parameters
     */
    public TodoTaskComments() {
    }

    /**
     * Constructor with all parameters
     * @param todoTaskCommentsId Unique Identifier for the To-do task Comments
     * @param taskComments Comments for the to do task
     * @param creationDate System generated creation date of the comments
     */
    public TodoTaskComments(Long todoTaskCommentsId, String taskComments, LocalDate creationDate) {
        this.todoTaskCommentsId = todoTaskCommentsId;
        this.taskComments = taskComments;
        this.creationDate = creationDate;
    }

    //Getters and setters for all the private variables declared above
    public Long getTodoTaskCommentsId() {
        return todoTaskCommentsId;
    }

    public void setTodoTaskCommentsId(Long todoTaskCommentsId) {
        this.todoTaskCommentsId = todoTaskCommentsId;
    }

    public String getTaskComments() {
        return taskComments;
    }

    public void setTaskComments(String taskComments) {
        this.taskComments = taskComments;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Tasks getTodoTask() {
        return todoTask;
    }

    public void setTodoTask(Tasks tasksTask) {
        this.todoTask = tasksTask;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TodoTaskComments{");
        sb.append("todoTaskCommentsId=").append(todoTaskCommentsId);
        sb.append(", taskComments='").append(taskComments).append('\'');
        sb.append(", creationDate=").append(creationDate);
        sb.append('}');
        return sb.toString();
    }
}
