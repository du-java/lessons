package lesson48.behavioral.mediator;

public class App {
    public static void main(String[] args) {
        final Fan fan = new Fan();
        final Controller controller = new Controller(new PowerSupplier(), fan);
        fan.setController(controller);
        final Button button = new Button(controller);

        button.press();
        button.press();
    }
}
