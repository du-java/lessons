package lesson48.behavioral.mediator;

import lombok.Setter;

@Setter
public class Fan {
    private Controller controller;
    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        controller.stop();
        isOn = false;
    }

    public void turnOn() {
        controller.start();
        isOn = true;
    }
}
