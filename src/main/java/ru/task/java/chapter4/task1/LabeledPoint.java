package ru.task.java.chapter4.task1;

import java.util.Objects;

public class LabeledPoint {

    private String label;
    private Point point;

    public LabeledPoint(Point point, String label, double x, double y) {
        this.point = point;
        this.label = label;

    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return point.toString() + "\n"
                + "LabeledPoint{" +
                "label='" + label +
                '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!point.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        int result = point.hashCode();
        result = 31 * result + Objects.hash(label);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LabeledPoint(new Point(1, 2), "sfsdf", 1, 2));
    }
}
