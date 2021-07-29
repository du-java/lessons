package lesson48.behavioral.chain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Chain {

    private final Processor first;

    public void startProcessing(Message message) {
        first.process(message);
    }

}
