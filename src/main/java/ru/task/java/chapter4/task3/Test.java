package ru.task.java.chapter4.task3;

public class Test {

    public static void main(String[] args) {
        LabeledPoint labeledPoint = new LabeledPoint("TestLabel", 1, 2);
        ParentPoint parentPoint = new ParentPoint();
        System.out.println(labeledPoint.x);
    }
}
