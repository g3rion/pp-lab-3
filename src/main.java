public class main {
    public static void main(String[] args) {
        Point point = new Point(10, 12);

        point.setX(10);
        point.setY(12);

        System.out.println("Współrzędne: (" + point.getX() + ", " + point.getY() + ")");
    }
}