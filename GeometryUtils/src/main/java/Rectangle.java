public class Rectangle {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Периметр прямоугольника равен: %f," +
                "Площадь прямоугольника равна: %f", getPerimeter(), getArea());
    }
}