import geometry.Square;

public class main {
    public static void main(String[] args) {
        Square square = new Square(6.0); // Kwadrat o boku długości 4.0

        System.out.println("Pole kwadratu: " + square.calculateArea());
        System.out.println("Obwód kwadratu: " + square.calculatePerimeter());
    }
}
