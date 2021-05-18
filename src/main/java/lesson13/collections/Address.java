package lesson13.collections;

public class Address {
    private int number;


    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return number == address.number;
    }

    @Override
    public int hashCode() {
        return number;
    }

    public Address(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
