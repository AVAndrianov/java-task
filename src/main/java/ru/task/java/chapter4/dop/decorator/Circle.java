package ru.task.java.chapter4.dop.decorator;

public class Circle implements Shape {

    private String label;

    public Circle() {
        label = "Circle";
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void draw() {
        System.out.print("Draw circle. ");
    }
}
