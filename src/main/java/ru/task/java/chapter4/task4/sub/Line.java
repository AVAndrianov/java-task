package ru.task.java.chapter4.task4.sub;

import ru.task.java.chapter4.task4.Point;
import ru.task.java.chapter4.task4.Shape;

public class Line extends Shape implements Cloneable {

    private Point pointTo;

    public Line(Point from, Point to) {
        super(from);
        this.pointTo = to;
    }

    @Override
    public Point getCenter() {
        return new Point((point.getX() + pointTo.getX()) / 2, (point.getY() + pointTo.getY()) / 2);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();

        // Глубокое клонирование
        // Line newLine = (Line) super.clone();
        // Point newPoint = new Point(pointTo.getX(), pointTo.getY());
        // newLine.setPointTo(newPoint);
        // return newLine;


    }
}
