import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;

public class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];

        circles[0] = new Circle(new Point(1, 6), 4);
        circles[1] = new ColoredCircle(new Point(7, 3), 7, "żółty");
        circles[2] = new Circle(new Point(3, 8), 3);
        circles[3] = new ColoredCircle(new Point(2, 9), 8, "szary");
        for (Circle circle : circles) {
            System.out.println("Obszar koła wynosi: " + circle.calculateArea());

            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor koła to: " + coloredCircle.getColor());
            }
        }
    }
}