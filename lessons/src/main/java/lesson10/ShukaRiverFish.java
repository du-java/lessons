package lesson10;

public class ShukaRiverFish extends RiverFish{
    private int teeth;
    @Override
    public void eat(){
        System.out.println("Eating " + teeth);
    }
    public ShukaRiverFish(int teeth){
        this.teeth = teeth;
    }
}
