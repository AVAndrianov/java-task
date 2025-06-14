package ru.task.java.chapter4.task3;


import java.util.Objects;

public class LabeledPoint extends Point {

    private final String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    //Пример equals и hashCode в случае наследования
    @Override
    public boolean equals(Object o) {
        return o instanceof LabeledPoint
                && Objects.equals(label, ((LabeledPoint) o).label)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Objects.hash(label);
        return result;
    }
}
