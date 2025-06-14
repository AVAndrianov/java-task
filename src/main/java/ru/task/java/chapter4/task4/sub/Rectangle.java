package ru.task.java.chapter4.task4.sub;

import ru.task.java.chapter4.task4.Point;
import ru.task.java.chapter4.task4.Shape;

public class Rectangle extends Shape implements Cloneable {
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

    @Override
    public Rectangle clone() {
        try {
            //copy mutable state here, so the clone can't change the internals of the original
            return (Rectangle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
