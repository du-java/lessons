package lesson48.behavioral.chain;

public class App {
    public static void main(String[] args) {

        final Processor processor = new MutationProcessor(new CheckerProcessor(new ValidationProcessor(null)));

        final Chain chain = new Chain(processor);
        chain.startProcessing(new Message("start"));

    }
}
