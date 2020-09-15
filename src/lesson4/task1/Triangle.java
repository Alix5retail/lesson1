package lesson4.task1;

public class Triangle implements Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return (width * height) / 2;
    }
}