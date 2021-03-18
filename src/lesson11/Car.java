package lesson11;

public class Car implements Transport {

    private Engine engine = new Engine();
    private Gear gear = new Gear();

    @Override
    public void drive() {
        if (engine.isOn) {
            System.out.println("car is driving");
        } else {
            System.out.println("car isn't driving");
        }
    }

    public void switchOn() {
        engine.isOn = true;
    }

    private class Engine {
        private boolean isOn;

        private void work() {
            System.out.println("engine works");
        }
    }

    public class Gear {
        private boolean isOn;

        private void work() {
            if (Car.this.engine.isOn) {
                System.out.println("gear works");
            } else {
                System.out.println("gear doesn't work");
            }
        }
    }

    private class Hood {
    }
}
