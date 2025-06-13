package ru.task.java.chapter4.task4;

import ru.task.java.chapter4.task4.sub.Circle;
import ru.task.java.chapter4.task4.sub.Line;
import ru.task.java.chapter4.task4.sub.Rectangle;

public abstract class Shape {

    protected final Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    public abstract Point getCenter();

    public static void main(String[] args) {
        //Объект поинт с координатами x=1, y=1
        //Объект поинт2 с координатами x=2, y=2
        Point point = new Point(1, 1);
        Point point2 = new Point(2, 2);
        System.out.println(point);
        //Объект лайн в который передается объект поинт и поинт2
        Line line = new Line(point, point2);
        System.out.println(line.getCenter());
        //Объект лайн в который передается объект поинт и радиус = 10
        Circle circle = new Circle(point, 10);
        System.out.println(circle.getCenter());
        //Объект лайн в который передается объект поинт, ширина = 10 и высота = 10
        Rectangle rectangle = new Rectangle(point, 10, 10);
        System.out.println(rectangle.getCenter());
    }
}
