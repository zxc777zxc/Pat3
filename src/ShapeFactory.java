import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
    private static final Map<String, Shape2> circleMap = new HashMap<>();

    public static Shape2 getCircle(String color) {
        Circle2 circle = (Circle2) circleMap.get(color);

        if (circle == null) {
            circle = new Circle2(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
