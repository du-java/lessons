package lesson48.behavioral.chain;

public abstract class AbstractProcessor implements Processor {

    private final Processor next;

    public AbstractProcessor(Processor next) {
        this.next = next;
    }

    protected abstract void doSomething();

    @Override
    public void process(Message message) {
        final String name = this.getClass().getSimpleName();
        System.out.println(name + ": processing [" + message.getMessage() + "] ...");
        if (next == null) {
            System.out.println("stopping ...");
            doSomething();
            return;
        }
        next.process(new Message(name));
        System.out.println(name + ": after processing [" + message.getMessage() + "] ...");
    }
}
