public class Sphere {
    private static final double PI = 3.14;

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4 / 3.0) * PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        return 4 * PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Объем сферы равен: %f, " +
                "площадь поверхности равна: %f ", getVolume(), getSurfaceArea());
    }
}