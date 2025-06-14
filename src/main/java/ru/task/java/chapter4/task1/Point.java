package ru.task.java.chapter4.task1;

import java.util.Objects;

public class Point {

    protected double x;
    protected double y;

    public  Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
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
        return o instanceof Point
                && Objects.equals(x, ((Point) o).x)
                && Objects.equals(y, ((Point) o).y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
