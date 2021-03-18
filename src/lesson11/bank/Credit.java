package lesson11.bank;

public class Credit extends AbstractAccount {

    @Override
    public void addMoney(Money money) {
        if (money!=null && money.getMoneyLow() > 0) {
            this.currentAmount.setMoneyLow(this.currentAmount.getMoneyLow() + money.getMoneyLow());
        }
    }
    @Override
    public void withdraw(Money money) {

    }

    @Override
    public Money status() {
        return null;
    }
}
