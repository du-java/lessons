package lesson48.structural.bridge;

public class CircleShape extends AbstractShape {

    public CircleShape(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Circle drawn. " + color.fill();
    }
}
