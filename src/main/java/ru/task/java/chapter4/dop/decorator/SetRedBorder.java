package ru.task.java.chapter4.dop.decorator;

public class SetRedBorder extends ShapeDecorator {

    public SetRedBorder(Shape shape) {
        super(shape);
    }

    public void draw() {
        shape.draw();
        setRedBoarder(shape);
    }

    private void setRedBoarder(Shape shape) {
        System.out.println("Red Boarder. " + shape);
    }
}
