package lesson48.structural.bridge;

public class SquareShape extends AbstractShape {

    public SquareShape(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
