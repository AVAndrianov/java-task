package ru.task.java.chapter4.task5;

import ru.task.java.chapter4.task5.sub.Circle;
import ru.task.java.chapter4.task5.sub.Line;
import ru.task.java.chapter4.task5.sub.Rectangle;

public abstract class Shape {

    protected final Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    public Point getCenter() {
        return null;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * Объект поинт с координатами x=3, y=1
         * Объект поинтКлонированный с координатами x=3, y=1
         */
        Point point = new Point(3, 100);
        Point point2 = new Point(1, 1);
        Point pointCloned = point.clone();
        System.out.println("point: " + point);
        System.out.println("pointCloned: " + pointCloned.toString() + "\n");
        /**
         * Объект лайн в который передается объект поинт и поинт2
         * Объект лайнКлонированный
         */
        Line line = new Line(point, point2);
        Line lineCloned = line.clone();
        System.out.println("line: " + line.getCenter());
        System.out.println("lineCloned:" + lineCloned.getCenter() + "\n");
        /**
         * Объект круг в который передается объект поинт и радиус = 10
         * Объект кругКлонированный
         */
        Circle circle = new Circle(point, 10);
        Circle circleCloned = circle.clone();
        System.out.println("circle: " + circle.getCenter());
        System.out.println("circleCloned: " + circleCloned.getCenter() + "\n");
        /**
         * Объект квадрат в который передается объект поинт, ширина = 10 и высота = 10
         * Объект квадратКлонированный
         */
        Rectangle rectangle = new Rectangle(point, 10, 10);
        Rectangle rectangleCloned = rectangle.clone();
        System.out.println("rectangle: " + rectangle.getCenter());
        System.out.println("rectangleCloned: " + rectangleCloned.getCenter());

    }
}
