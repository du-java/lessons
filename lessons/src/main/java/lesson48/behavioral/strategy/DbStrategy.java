package lesson48.behavioral.strategy;

public class DbStrategy implements Strategy{
    @Override
    public void process() {
        System.out.println("save db");
    }
}
