package ru.task.java.chapter4.task7;

public class ColorDraw {

    public static void main(String[] args) {
        String sb;
        for (ColorEnum c : ColorEnum.values()) {
            sb = c.name() + " " +
                    c.getRed() + " " +
                    c.getGreen() + " " +
                    c.getBlue();
            System.out.println(sb);
        }
    }
}
