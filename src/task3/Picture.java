package task3;

public class Picture {

    public final Circle circle;
    public final Parabola parabola;
    public final Rectangle rectangle;

    public Picture(Circle circle, Parabola parabola, Rectangle rectangle) {
        this.circle = circle;
        this.parabola = parabola;
        this.rectangle = rectangle;
    }

    public SimpleColor getColor(double x, double y) {

        if (parabola.isPointInsideParabola(x, y) && (rectangle.isPointInsideRectangle(x, y))) return SimpleColor.GRAY;

        if ((circle.isPointInsideCircle(x, y)) && (rectangle.isPointInsideRectangle(x, y))) return SimpleColor.GREEN;

        if (parabola.isPointInsideParabola(x, y)) return SimpleColor.WHITE;

        if (circle.isPointInsideCircle(x, y)) return SimpleColor.BLUE;

        if (rectangle.isPointInsideRectangle(x, y)) return SimpleColor.YELLOW;

        return SimpleColor.GRAY;
    }

}