package lesson13.generics;

public class TransactionImpl<T extends Account> implements Transaction<T> {

    private T from;
    private T to;
    private int sum;

    public TransactionImpl(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    @Override
    public void execute() {
        int fromAmount = from.getAmount();
        int toAmount = to.getAmount();

        from.setAmount(fromAmount - sum);
        to.setAmount(toAmount + sum);
    }
}
