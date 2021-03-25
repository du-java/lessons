package lesson13;

public class App01 {
    public static void main(String[] args) {

        Account accountFrom = new DepositAccount(100);
        Account accountTo = new DepositAccount(100);

        Transaction<Account> transaction = new TransactionImpl<>(accountFrom, accountTo, 100);
        transaction.execute();
    }
}
