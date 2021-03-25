package lesson13;

public abstract class AbstractAccount implements Account {
    public AbstractAccount(int amount) {
        this.amount = amount;
    }

    protected int amount;

}
