package lesson48.structural.bridge;

public abstract class AbstractShape {

    protected Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract String draw();
}
