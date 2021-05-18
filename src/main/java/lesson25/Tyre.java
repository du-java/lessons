package lesson25;

public class Tyre {
    private int size;
    private String brand;

    public Tyre() {
    }

    public Tyre(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "size=" + size +
                ", brand='" + brand + '\'' +
                '}';
    }
}
