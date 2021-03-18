package lesson11.bank;

public abstract class AbstractAccount implements Account{
    protected int percent;
    protected Money currentAmount;


    @Override
    public void print() {
        System.out.printf("выводим статус денег %s \n ", currentAmount.toString());
    }
}
