package ru.task.java.chapter4.task5;

import java.util.Objects;

public class LabeledPoint extends Point implements Cloneable{

    private final String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;

    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    @Override
    protected Point clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
