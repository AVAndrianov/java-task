package ru.task.java.chapter4.task3;

import ru.task.java.chapter3.SubPointOutSidePackage;

public class SubPointInSidePackage extends Point {

    private LabeledPoint labeledPoint;

    public SubPointInSidePackage(LabeledPoint labeledPoint) {
        super(1, 2);
        this.labeledPoint = labeledPoint;
    }

    public SubPointInSidePackage() {
        super(1, 1);
    }

    public LabeledPoint getLabeledPoint() {
        return labeledPoint;
    }

    public void getPointParam() {
// Доступны параметры класса Point наследнику находящемуся в том же пакете что и Point
        System.out.println(this.x);
        System.out.println(this.y);
    }

    public static void main(String[] args) {
        LabeledPoint labeledPoint1 = new LabeledPoint(1, 2, "Label");
        SubPointInSidePackage subPointInSidePackage = new SubPointInSidePackage(labeledPoint1);
        SubPointOutSidePackage subPointOutSidePackage = new SubPointOutSidePackage(labeledPoint1);
// Если класс в котором создается экземпляры классов 1, 2 и 3 находится в том же пакете с классом Point
// параметры Point становятся доступны
// 1. Находящихся в пакете
// 2. Не находящихся в пакете
// 3. Являющихся подклассом
        System.out.println(labeledPoint1.x);
        System.out.println(subPointInSidePackage.x);
        System.out.println(subPointOutSidePackage.getLabeledPoint().x);
    }
}
