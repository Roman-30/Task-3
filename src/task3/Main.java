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

        printProgramResult(point, color);
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

            SimpleColor color = picture.getColor(point);
            SimpleColor rightColor = test.getRightColor();

            if (color == rightColor) {
                printTestResult(point, color, rightColor, result);
            } else {
                printTestResult(point, color, rightColor, result);
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

    public static void printProgramResult(Point point, SimpleColor color) {
        System.out.printf("FOR X = %1$S AND Y = %2$S  IS POINT IN " + color + " AREA  \n", point.getX(), point.getY());
    }

    public static void printTestResult(Point point, SimpleColor color, SimpleColor rightColor, boolean result) {
        System.out.printf("FOR X = %1$S AND Y = %2$S Expected " + color + " Color -> Happened %3$S\n", point.getX(), point.getY(), rightColor + " Color");
        System.out.printf("%s\n", result);
    }
}


