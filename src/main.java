import geometry.Point;
import geometry.Circle;

public class main {
    public static void main(String[] args) {
        Point center = new Point(0, 0);

        Circle circle = new Circle(center, 8);

        System.out.println("Centrum koła: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + circle.getRadius());
        System.out.println("Obwód koła: " + circle.calculatePerimeter());
    }
}
