package ru.task.java.chapter4.task5.sub;

import ru.task.java.chapter4.task5.Point;
import ru.task.java.chapter4.task5.Shape;

public class Circle extends Shape implements Cloneable {

    private double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
