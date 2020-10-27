package task3;

public class TestCase {
    public double x;
    public double y;
    public SimpleColor rightColor;

    public TestCase(double x, double y, SimpleColor rightColor) {
        this.x = x;
        this.y = y;
        this.rightColor = rightColor;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public SimpleColor getRightColor() {
        return rightColor;
    }
}
