package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Circle(-5, 0, 4), new Parabola(1, -4, -2), new Rectangle());

        testPoint(picture);
        startProgram(picture);
    }

    public static void startProgram(Picture picture) {

        double x = readPointCoordinate("Enter point coordinate x --> ");
        double y = readPointCoordinate("Enter point coordinate y --> ");

        Point point = new Point(x, y);

        SimpleColor color = picture.getColor(point);

        printColor(x, y, color);
    }

    public static void testPoint(Picture picture) {
        Point[] point = {new Point(2, 3), new Point(-5, 0), new Point(-1, -2), new Point(8, 2), new Point(-2, 1), new Point(0, 4)};
        SimpleColor[] correctResults = {SimpleColor.WHITE, SimpleColor.BLUE, SimpleColor.YELLOW, SimpleColor.GRAY, SimpleColor.GREEN, SimpleColor.GRAY};

        for (int i = 0; i < point.length; i++) {
            SimpleColor color = picture.getColor(point[i]);
            printColor(point[i].x, point[i].y, color);
            SimpleColor rightColor = correctResults[i];

            if (color == rightColor) {
                System.out.printf("%s\n", checkResult(rightColor, color));
            } else {
                System.out.printf("%s\n", checkResult(rightColor, color));
                System.exit(0);
            }
        }
    }

    public static int readPointCoordinate(String name) {
        Scanner in = new Scanner(System.in);
        System.out.print(name);
        return in.nextInt();
    }

    public static void printColor(double x, double y, SimpleColor color) {
        System.out.printf("FOR X = %1$S AND Y = %2$S IS POINT IN " + color + " AREA \n", x, y);
    }

    public static boolean checkResult(SimpleColor color, SimpleColor rightColor) {
        return color == rightColor;
    }
}


