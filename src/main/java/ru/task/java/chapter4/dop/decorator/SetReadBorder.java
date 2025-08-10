package ru.task.java.chapter4.dop.decorator;

public class SetReadBorder extends ShapeDecorator {

    public SetReadBorder(Shape shape) {
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
