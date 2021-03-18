package lesson11.bank;

public class CreditAccount extends AbstractAccount {

    public CreditAccount(int percent, Money currentAmount) {
        super(percent, currentAmount);
    }

    @Override
    public Money status() {
       currentAmount.setMoneyLow( currentAmount.getMoneyLow() - (currentAmount.getMoneyLow() /100 ) * percent);
       return currentAmount;
    }
}
