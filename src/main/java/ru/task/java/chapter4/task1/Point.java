package ru.task.java.chapter4.task1;

import java.util.Objects;

public final class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
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
        return o instanceof Point p
                && Objects.equals(x, p.x)
                && Objects.equals(y, p.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
