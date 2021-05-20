package lesson11.bank;

public abstract class AbstractAccount implements Account {
    protected int percent;
    protected Money currentAmount;

    public AbstractAccount(int percent, Money currentAmount) {
        if (percent <= 0) {
            throw new IllegalArgumentException("wrong percent");
        }
        this.percent = percent;
        this.currentAmount = currentAmount;
    }

    @Override
    public void addMoney(Money money) {
        currentAmount = currentAmount.add(money);
    }

    @Override
    public void withdraw(Money money) {
        currentAmount = currentAmount.sub(money);
    }

    @Override
    public void print() {
        System.out.printf("enter status of money %s \n ", currentAmount.toString());
    }
}

