package ru.task.java.chapter4.task7;


import java.awt.*;

public enum ColorEnum {

    BLACK(Color.BLACK),
    RED(Color.RED),
    BLUE(Color.BLUE),
    GREEN(Color.GREEN),
    CYAN(Color.CYAN),
    MAGENTA(Color.MAGENTA),
    YELLOW(Color.YELLOW),
    WHITE(Color.WHITE);

    private Color color;

    ColorEnum(Color color) {
        this.color = color;
    }

    public int gerColor() {
        return color.getRGB();
    }
}
