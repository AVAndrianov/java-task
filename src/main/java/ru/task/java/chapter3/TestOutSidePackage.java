package ru.task.java.chapter3;

import ru.task.java.chapter4.task3.LabeledPoint;
import ru.task.java.chapter4.task3.SubPointInSidePackage;

public class TestOutSidePackage {

    public static void main(String[] args) {
        LabeledPoint labeledPoint1 = new LabeledPoint(1, 2, "Label");
        SubPointInSidePackage subPointInSidePackage = new SubPointInSidePackage(labeledPoint1);
        SubPointOutSidePackage subPointOutSidePackage = new SubPointOutSidePackage(labeledPoint1);

        //'x' has protected access in 'ru.task.java.chapter4.task3.Point'

//        System.out.println(labeledPoint1.x);
//        System.out.println(subPointInSidePackage.x);
//        System.out.println(subPointOutSidePackage.getLabeledPoint().x);
    }
}
