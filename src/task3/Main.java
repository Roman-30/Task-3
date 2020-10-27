package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Circle(-5, 0, 4), new Parabola(1, -4, -2), new Rectangle());

        if (testPoint(picture)) {
            startProgram(picture);
        } else {
            System.out.println("An error was found in the data. Re-enter the data.");
        }
    }

    public static void startProgram(Picture picture) {

        double x = readPointCoordinate("Enter point coordinate x --> ");
        double y = readPointCoordinate("Enter point coordinate y --> ");

        Point point = new Point(x, y);

        SimpleColor color = picture.getColor(point);

        printColor(point, color);
    }

    public static boolean testPoint(Picture picture) {
        boolean result = true;

        TestCase[] cases = new TestCase[6];
        cases[0] = new TestCase(2, 3, SimpleColor.WHITE);
        cases[1] = new TestCase(-5, 0, SimpleColor.BLUE);
        cases[2] = new TestCase(-1, -2, SimpleColor.YELLOW);
        cases[3] = new TestCase(8, 2, SimpleColor.GRAY);
        cases[4] = new TestCase(-2, 0, SimpleColor.GREEN);
        cases[5] = new TestCase(0, 4, SimpleColor.GRAY);

        for (TestCase test : cases) {
            Point point = new Point(test.getX(), test.getY());

<<<<<<< HEAD
            SimpleColor color = picture.getColor(point);
            SimpleColor rightColor = test.getRightColor();
=======
        for (int i = 0; i < point.length; i++) {
            SimpleColor color = picture.getColor(point[i]);
            printColor(point[i].x, point[i].y, color);
            SimpleColor rightColor = correctResults[i];
>>>>>>> d1547b2a22c5f6b40b1deb8a0226568a8b623c42

            if (checkResult(color, rightColor)) {
                printColor(point, color);
                System.out.printf("%s\n", result);
            } else {
                printColor(point, color);
                System.out.printf("%s\n", result);
                result = false;
            }
        }
        return result;
    }

    public static int readPointCoordinate(String name) {
        Scanner in = new Scanner(System.in);
        System.out.print(name);
        return in.nextInt();
    }

    public static void printColor(Point point, SimpleColor color) {
        System.out.printf("FOR X = %1$S AND Y = %2$S IS POINT IN " + color + " AREA \n", point.getX(), point.getX());
    }

    public static boolean checkResult(SimpleColor color, SimpleColor rightColor) {
        return color == rightColor;
    }
}


