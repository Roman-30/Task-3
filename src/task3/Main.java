package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Circle(-5, 0, 4), new Parabola(1, -4, -2), new Rectangle());

        testPoint(picture);
        startProgram(picture);
    }

    public static void startProgram(Picture picture) {
        double restart = readNumber();

        while (restart == 1) {
            double x = readPointCoordinate("Enter point coordinate x --> ");
            double y = readPointCoordinate("Enter point coordinate y --> ");

            SimpleColor color = picture.getColor(x, y);

            printColor(x, y, color);

            restart = readPointCoordinate("Enter number 1 if you want to input new coordinates or 0 if you want finish program - ");

            if (restart == 0) {
                System.out.print("End.");
            }
        }
    }

    public static void testPoint(Picture picture) {
        double[][] coordinates = {{2, -5, -1, 8, -2, 0}, {3, 0, -2, 2, 1, 4}};
        SimpleColor[] correctResults = {SimpleColor.WHITE, SimpleColor.BLUE, SimpleColor.YELLOW, SimpleColor.GRAY, SimpleColor.GREEN, SimpleColor.GRAY};

        for (int i = 0; i < 6; i++) {
            SimpleColor color = picture.getColor(coordinates[0][i], coordinates[1][i]);
            printColor(coordinates[0][i], coordinates[1][i], color);
            SimpleColor rightColor = correctResults[i];

            System.out.printf("%s\n", checkResult(color, rightColor));
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

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 if you want start program - ");
        return scanner.nextInt();
    }
}


