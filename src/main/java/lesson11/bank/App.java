package lesson11.bank;

public class App {
    public static void main(String[] args) {
        Account debet = new DebitAccount(20, new Money(1002));
        debet.print();
        debet.withdraw(new Money(128));
        debet.status();
        debet.print();

        Money money = new Money(10);

        Money multiply = money
                .add(new Money(10))
                .div(money)
                .multiply(new Money(1));

        Account[] accounts = new Account[3];
        accounts[0] = debet;
        accounts[1] = new AbstractAccount(1, new Money(10)) {
            @Override
            public Money status() {
                return currentAmount;
            }
        };
        accounts[2] = new CreditAccount(10, new Money(100));


        for (Account account : accounts) {
            account.status();
            account.print();
        }


    }
}
