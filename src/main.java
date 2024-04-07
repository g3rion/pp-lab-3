import geometry.Point;
import geometry.ColoredCircle;

public class main {
    public static void main(String[] args) {
        Point center = new Point(0, 0);

        ColoredCircle coloredCircle = new ColoredCircle(center, 8, "czerwony");

        System.out.println("Centrum koła: (" + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + ")");
        System.out.println("Promień koła: " + coloredCircle.getRadius());
        System.out.println("Obwód koła: " + coloredCircle.calculatePerimeter());
        System.out.println("Kolor koła: " + coloredCircle.getColor());
    }
}
