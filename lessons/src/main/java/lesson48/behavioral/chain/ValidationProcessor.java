package lesson48.behavioral.chain;

public class ValidationProcessor extends AbstractProcessor {
    public ValidationProcessor(Processor next) {
        super(next);
    }

    @Override
    protected void doSomething() {
        System.out.println("Validation");
    }
}
