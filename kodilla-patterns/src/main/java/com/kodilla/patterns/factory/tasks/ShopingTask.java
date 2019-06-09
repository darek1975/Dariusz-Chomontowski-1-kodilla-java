package com.kodilla.patterns.factory.tasks;

public final class ShopingTask implements Task {

    final String taskName;
    final String whatToBuy;
    final Double quantity;
    boolean taskStatus = false;

    public ShopingTask(String taskName, String whatToBuy, Double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask() {
        System.out.println("The task is executing...");
        taskStatus = true;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return taskStatus;
    }
}
