package ru.task.java.chapter4.task3;


import java.util.Objects;

public class Point {

    protected double x;
    protected double y;

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
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
