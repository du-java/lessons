package lesson11.bank;

public interface Account {

    void addMoney(Money money);

    void withdraw(Money money);

    Money status();

}
