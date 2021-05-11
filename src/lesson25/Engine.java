package lesson25;

public class Engine {
    private int power;
    private String type;

    public Engine() {
    }

    public Engine(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                '}';
    }
}
