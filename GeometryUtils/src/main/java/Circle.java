public class Circle {

    private static final double PI = 3.14;

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Площадь круга равна: %f, " +
                "длина окружности равна: %f ", getArea(), getCircumference());
    }
}
