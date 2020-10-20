package task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Picture picture = new Picture(new Circle(-5, 0, 4), new Parabola(1, -4, -2), new Rectangle());

        test(picture);

        double x = readPointCoordinate("x --> ");
        double y = readPointCoordinate("y --> ");

        outputColourForPoint(x, y, picture);

    }

    private static void outputColourForPoint (double x, double y, Picture picture) {
        System.out.printf("(%.1f, %.1f) The area which contains this point is %S%n", x, y, picture.getColor(x, y));
    }

    private static void test(Picture picture) {
        double[] coordinateX = {2, -5, -1, 8, -2, 0};
        double[] coordinateY = {3, 0, -2, 2, 1, 4};

        for (int k = 0; k <= 5; k++) {

                outputColourForPoint(coordinateX[k], coordinateY[k], picture);
            }
        }

    static int readPointCoordinate(String name) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter coordinate %s", name);
        return in.nextInt();

    }
}

