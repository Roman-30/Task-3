package task3;

public class Circle {
    int x0;
    int y0;
    int radius;

    public Circle(int x0, int y0, int radius) {
        this.x0 = x0;
        this.y0 = y0;
        this.radius = radius;
    }

    public boolean isPointInsideCircle(double x, double y) {
        double dx = x - x0;
        double dy = y - y0;
        double distance = Math.sqrt(dx * dx + dy * dy);

        return distance <= radius;
    }
}
