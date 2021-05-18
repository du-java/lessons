package lesson11.bank;

public final class Money {
    private final int moneyLow;

    public Money(int moneyLow) {
        if (moneyLow < 0) {
            throw new IllegalArgumentException("wrong input");
        } else {
            this.moneyLow = moneyLow;
        }
    }

    public int getMoneyLow() {
        return moneyLow;
    }

    public Money percent(int percent) {
        return new Money(moneyLow / 100 * percent);
    }

    public Money add(Money money) {
        if (money == null || money.getMoneyLow() < 0) {
            throw new IllegalArgumentException("wrong money");
        }
        return new Money(moneyLow + money.moneyLow);
    }

    public Money div(Money money) {
        if (money == null || money.getMoneyLow() <= 0) {
            throw new IllegalArgumentException("wrong money");
        }
        return new Money(moneyLow / money.moneyLow);
    }

    public Money multiply(Money money) {
        if (money == null || money.getMoneyLow() < 0) {
            throw new IllegalArgumentException("wrong money");
        }
        return new Money(moneyLow * money.moneyLow);
    }

    public Money sub(Money money) {
        if (
                money == null
                        || money.getMoneyLow() < 0
                        || money.moneyLow > moneyLow
        ) {
            throw new IllegalArgumentException("wrong money");
        }
        return new Money(moneyLow - money.moneyLow);
    }

    @Override
    public String toString() {
        return "Money{" +
                "moneyLow=" + moneyLow +
                '}';
    }
}
