package lesson48.behavioral.chain;

public class CheckerProcessor extends AbstractProcessor {
    public CheckerProcessor(Processor next) {
        super(next);
    }

    @Override
    protected void doSomething() {
        System.out.println("Checker");
    }
}
