package ru.task.java.chapter4.task7;


import java.awt.*;
import java.awt.image.BufferedImage;

public class ColorDraw2 {

    BufferedImage bufferedImage;

//    public ColorDraw(BufferedImage bufferedImage) {
//        this.bufferedImage = bufferedImage;
//    }
//
//    public BufferedImage getBufferedImage() {
//        return bufferedImage;
//    }

    public static void main(String[] args) {

//        ColorDraw colorDraw = new ColorDraw(new BufferedImage(100, 100, BufferedImage.TYPE_INT_BGR));
//        Color color = null;
//        for (int i = 0; i < 100; i++) {
//            for (int j = 0; j < 100; j++) {
//                color = new Color(i, j, 100);
//                colorDraw.getBufferedImage().setRGB(i, j, color.getRGB());
//            }
//        }
//
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setSize(200, 200);
//
//        BufferedImage image = colorDraw.getBufferedImage();
//        JPanel pane = new JPanel() {
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                g.drawImage(image, 0, 0, null);
//            }
//        };

//        frame.add(pane);
//        frame.setVisible(true);


//        System.out.println(new Color(ColorEnum.GREEN.gerColor()).getGreen());
//        System.out.println(new Color(Color.BLUE.getRGB()).getGreen());
//        System.out.println(color.getBlue());
//        System.out.println(color.getRed());
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
