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

    public SimpleColor getColor(Point point) {
        double x = point.getX();
        double y = point.getY();

        if (parabola.isPointInside(x, y) && (rectangle.isPointInside(x, y))) return SimpleColor.GRAY;

        if ((circle.isPointInside(x, y)) && (rectangle.isPointInside(x, y))) return SimpleColor.GREEN;

        if (parabola.isPointInside(x, y)) return SimpleColor.WHITE;

        if (circle.isPointInside(x, y)) return SimpleColor.BLUE;

        if (rectangle.isPointInside(x, y)) return SimpleColor.YELLOW;

        return SimpleColor.GRAY;
    }

}