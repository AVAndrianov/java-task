package ru.task.java.chapter4.task1;

import java.util.Objects;

public class LabeledPoint {

    private final String label;
    private final Point point;

    public LabeledPoint(Point point, String label) {
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

    //Пример equals и hashCode в случае агрегации
    @Override
    public boolean equals(Object o) {
        return o instanceof LabeledPoint lp
                && Objects.equals(point, lp.point)
                && Objects.equals(label, lp.label);
    }

    @Override
    public int hashCode() {
        int result = point.hashCode();
        result = 31 * result + Objects.hash(label);
        return result;
    }

    public static void main(String[] args) {
        LabeledPoint labeledPoint1 = new LabeledPoint(new Point(1, 2), "Label");
        LabeledPoint labeledPoint2 = new LabeledPoint(new Point(1, 2), "Label");
        System.out.println(labeledPoint1.equals(labeledPoint2));
    }
}
