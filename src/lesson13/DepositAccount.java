package lesson13;

public class DepositAccount extends AbstractAccount {

    public DepositAccount(int amount) {
        super(amount);
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int sum) {
        this.amount = sum;
    }
}
