package lesson13.generics.transfer;

public class Transaction <A extends Account, M extends Money>{
    private A from, to;
    private M amount;
    public void execute(){

    }

}
