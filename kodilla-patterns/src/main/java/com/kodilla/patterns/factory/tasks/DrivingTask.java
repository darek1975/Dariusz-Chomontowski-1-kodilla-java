package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    final String taskName;
    final String where;
    final String using;
    boolean taskStatus = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void executeTask() {
        System.out.println("Is driving now...");
        taskStatus = true;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
