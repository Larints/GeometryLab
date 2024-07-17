public class GeometryUtils {

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double convertCentimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static boolean compareAreas(double area1, double area2) {
        return Double.compare(area1, area2) == 0;
    }

    public static boolean comparePerimeters(double perimeter1, double perimeter2) {
        return Double.compare(perimeter1, perimeter2) == 0;
    }
}