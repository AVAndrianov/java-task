package ru.task.java.chapter4.task7;


import java.awt.*;

public class ColorDraw {

    public static void main(String[] args) {

        ColorEnum[] colorEnums = ColorEnum.values();
        for (ColorEnum colorEnum : colorEnums) {
            System.out.println(colorEnum);
            System.out.println(" RED " + new Color(colorEnum.gerColor()).getRed());
            System.out.println(" GREEN " + new Color(colorEnum.gerColor()).getGreen());
            System.out.println(" BLUE " + new Color(colorEnum.gerColor()).getBlue());
            System.out.println();
        }
    }
}
