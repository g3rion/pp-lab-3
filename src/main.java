import geometry.rectangle;

public class main {
    public static void main(String[] args) {
        // Tworzenie obiektu Rectangle z określoną długością i szerokością
        rectangle rectangle = new rectangle(5.0, 3.0);

        // Wyświetlanie właściwości prostokąta
        System.out.println("Pole prostokąta: " + rectangle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
    }
}
