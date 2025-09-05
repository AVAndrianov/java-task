package ru.task.java.chapter4.dop.decorator;

public class Demo {

    public static void main(String[] args) {
        Shape setReadBorder = new SetRedBorder(new Circle());
        setReadBorder.draw();
    }
}
