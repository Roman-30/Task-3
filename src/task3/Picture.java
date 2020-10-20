package task3;

public class Picture {

    private final Circle circle;
    private final Parabola parabola;
    private final Rectangle rectangle;

    public Picture(Circle circle, Parabola parabola,  Rectangle rectangle) {
        this.circle = circle;
        this.parabola = parabola;
        this.rectangle = rectangle;
    }

    public Color getColor(double x, double y) {

    if (parabola.isPointInsideParabola(x, y) && (rectangle.isPointInsideRectangle(x, y))) return Color.GRAY;

    if ((circle.isPointInsideCircle(x, y)) && (rectangle.isPointInsideRectangle(x, y))) return Color.GREEN;

    if (parabola.isPointInsideParabola(x, y)) return Color.WHITE;

    if (circle.isPointInsideCircle(x, y)) return Color.BLUE;

    if (rectangle.isPointInsideRectangle(x, y)) return Color.YELLOW;

    return Color.GRAY;
    }

}