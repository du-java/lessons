package lesson48.behavioral.strategy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Service {
    private final Strategy strategy;

    void makeSomething() {
        strategy.process();
    }

    void makeSomething(Strategy strategy1) {
        strategy1.process();
    }

}
