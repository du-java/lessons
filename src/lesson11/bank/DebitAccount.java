package lesson11.bank;

public class DebitAccount extends AbstractAccount {

    public DebitAccount(int percent, Money currentAmount) {
        super(percent, currentAmount);
    }

    @Override
    public Money status() {
        return currentAmount = currentAmount.add(currentAmount.percent(percent));

        // currentAmount + currentAmount.percent(percent)
    }
}
