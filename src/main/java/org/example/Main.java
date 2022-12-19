package org.example;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    private static BufferedImage image;

    public static void main(String[] args) throws IOException {

        readImg("src/main/resources/Pipe.png");

        Color color = new Color(image.getRGB(200,200));

        deleteBackground();


        System.out.println(color.getRed() + " " + color.getGreen() + " " + color.getBlue());


        writeImg("src/main/resources/Pipe2.png");
    }

    private static void readImg(String source) throws IOException {

        File file_img = new File(source);
        image = ImageIO.read(file_img);
    }

    private static void writeImg(String source) throws IOException {
        File new_img = new File(source);
        ImageIO.write(image,"png",new_img);
    }

    private static void deleteBackground() {
        int height = image.getHeight();
        int width = image.getWidth();

        for (int i = 0; i < height; i++ ){
            for (int j = 0; i < width; i++){
                Color color = new Color(image.getRGB(i,j));


            }
        }
    }



}