package lesson11.bank;

public abstract class AbstractAccount implements Account {
    protected int percent;
    protected Money currentAmount;

    @Override
    public void addMoney(Money money) {
        if (money != null && money.getMoneyLow() > 0) {
            this.currentAmount.setMoneyLow(this.currentAmount.getMoneyLow() + money.getMoneyLow());
        }
    }

    @Override
    public void withdraw(Money money) {

    }

    @Override
    public void print() {
        System.out.printf("выводим статус денег %s \n ", currentAmount.toString());
    }
}
