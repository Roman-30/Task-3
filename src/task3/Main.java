package task3;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Circle(-5, 0, 4), new Parabola(1, -4, -2), new Rectangle());

        test(picture);

        double x = readPointCoordinate("x --> ");
        double y = readPointCoordinate("y --> ");

        outputColourForPoint(x, y, picture);

    }

    public static void outputColourForPoint(double x, double y, Picture picture) {
        System.out.printf("The area which contains this point (%.1f, %.1f) is %S", x, y, picture.getColor(x,y));
    }

    public static void test(Picture picture) {
        Point[] coordinate = new Point[6];
        coordinate[0] = new Point(2,3);
        coordinate[1] = new Point(-5,0);
        coordinate[2] = new Point(-1,-2);
        coordinate[3] = new Point(-2,1);
        coordinate[4] = new Point(0,4);


        for (int i = 0; i < 5; i++) {

            System.out.printf("%s --> ", coordinate[i], picture);

            SimpleColor color = SimpleColor.GRAY;

            switch (i) {
                case (0):
                    color = SimpleColor.WHITE;
                    break;
                case (1):
                    color = SimpleColor.BLUE;
                    break;
                case (2):
                    color = SimpleColor.YELLOW;
                    break;
                case (3):
                    color = SimpleColor.GREEN;
                    break;
                case (4):
                    color = SimpleColor.GRAY;
                    break;

            }

            System.out.printf("%s\n" , color);

            }
    }


    public static int readPointCoordinate(String name) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter coordinate %s", name);
        return in.nextInt();

    }
}

