package lesson48.behavioral.strategy;

public class FileStrategy implements Strategy{
    @Override
    public void process() {
        System.out.println("save file");
    }
}
