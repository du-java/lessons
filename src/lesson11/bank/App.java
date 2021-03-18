package lesson11.bank;

public class App {
    public static void main(String[] args) {
        Account debet = new DebitAccount(20, new Money(1002));
        debet.print();
        debet.withdraw(new Money(128));
        debet.status();
        debet.print();
    }
}
