package lesson48.behavioral.chain;

public class MutationProcessor extends AbstractProcessor {
    public MutationProcessor(Processor next) {
        super(next);
    }
    @Override
    protected void doSomething() {
        System.out.println("Mutation");
    }
}