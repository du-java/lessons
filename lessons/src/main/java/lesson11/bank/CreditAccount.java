package lesson11.bank;

public class CreditAccount extends AbstractAccount {

    public CreditAccount(int percent, Money currentAmount) {
        super(percent, currentAmount);
    }

    @Override
    public Money status() {
        currentAmount = currentAmount.sub(currentAmount.percent(percent));
        return currentAmount;
    }
}
