package lesson11.bank;

public class Money {
    private int moneyLow;

    public Money(int moneyLow) {
        if (moneyLow < 0) {
            this.moneyLow = 0;
        } else this.moneyLow = moneyLow;
    }

    public int getMoneyLow() {
        return moneyLow;
    }

    public void setMoneyLow(int moneyLow) {
        this.moneyLow = moneyLow;
    }

    @Override
    public String toString() {
        return "Money{" +
                "moneyLow=" + moneyLow +
                '}';
    }
}
