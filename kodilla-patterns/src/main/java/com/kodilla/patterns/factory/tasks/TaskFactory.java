package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShopingTask("Buy Food", "Milk", 1.0);
            case PAINTING:
                return new PaintingTask("Paint the wall", "Blue", "wall");
            case DRIVING:
                return new DrivingTask("Go to Work", "Work", "Car");
            default:
                return null;
        }
    }
}
