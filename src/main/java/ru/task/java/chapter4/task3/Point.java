package ru.task.java.chapter4.task3;

import java.util.Objects;

public class Point extends ParentPoint{

    protected double x;
    protected double y;

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    protected double getX() {
        return x;
    }

    protected double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Point point = new LabeledPoint("Этикетка", 1, 2);
        System.out.println(point.getX() + " " + point.getY());

        LabeledPoint labeledPoint = new LabeledPoint("Этикетка", 1, 2);
        System.out.println(labeledPoint.getX() + " " + labeledPoint.getY());

        // Объявите как protected переменные экземпляра х и у из класса Point в
        // упражнении 1. Продемонстрируйте, что эти переменные доступны классу
        // LabeledPoint только в его экземплярах.

        // Похоже что доступны отовсюду protected = пакет + наследники
    }
}
