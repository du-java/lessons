package lesson48.structural.bridge;

public class App {
    public static void main(String[] args) {
        final SquareShape squareShape = new SquareShape(new RedColor());
        System.out.println(squareShape.draw());

        final CircleShape circleShape = new CircleShape(new BlueColor());
        System.out.println(circleShape.draw());
    }
}
