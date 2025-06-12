package ru.task.java.chapter4.task4.sub;

import ru.task.java.chapter4.task4.Point;
import ru.task.java.chapter4.task4.Shape;

public class Rectangle extends Shape {
    private double width;
    private double high;

    public Rectangle(Point topLeft, double width, double high) {
        super(topLeft);
        this.width = width;
        this.high = high;
    }

    @Override
    public Point getCenter() {
        return new Point((point.getX() + width) / 2, (point.getY() + high) / 2);
    }
}
