package lesson48.behavioral.mediator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Button {
    private final Controller controller;

    public void press() {
        controller.press();
    }
}
