package ru.task.java.chapter4.dop.decorator;

public class Circle implements Shape {

    private String currentShape;

    public Circle() {
        currentShape = "Circle";
    }

    public String getCurrentShape() {
        return currentShape;
    }

    public void setCurrentShape(String currentShape) {
        this.currentShape = currentShape;
    }

    @Override
    public void draw() {
        System.out.print("Draw circle. ");
    }
}
