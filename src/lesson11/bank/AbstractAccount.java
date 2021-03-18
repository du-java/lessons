package lesson11.bank;

public abstract class AbstractAccount implements Account {
    protected int percent;
    protected Money currentAmount;

    public AbstractAccount(int percent, Money currentAmount) {
        if (percent > 0 && currentAmount.getMoneyLow() > 0) {
            this.percent = percent;
            this.currentAmount = currentAmount;
        }
    }

    @Override
    public void addMoney(Money money) {
        if (money != null && money.getMoneyLow() > 0) {
            this.currentAmount.setMoneyLow(this.currentAmount.getMoneyLow() + money.getMoneyLow());
        }
    }

    @Override
    public void withdraw(Money money) {
        if (money != null && money.getMoneyLow() > 0 && money.getMoneyLow() <= currentAmount.getMoneyLow()) {
            this.currentAmount.setMoneyLow(this.currentAmount.getMoneyLow() - money.getMoneyLow());
        }
    }

    @Override
    public void print() {
        System.out.printf("выводим статус денег %s \n ", currentAmount.toString());
    }
}

