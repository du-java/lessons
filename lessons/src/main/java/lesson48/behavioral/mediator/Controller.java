package lesson48.behavioral.mediator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Controller {
    private final PowerSupplier powerSupplier;
    private final Fan fan;

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}
