package ru.task.java.chapter4.task3;

public class ParentPoint {
    private String label;

    public ParentPoint() {
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "LabeledPoint{" +
                "label='" + label + '\'' +
                '}';
    }
}
