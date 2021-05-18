package lesson14;

public class Address {
        private String city;
        private int numberOfHouse;
        private String street;
        private int numberOfFlat;

    public String getCity() {
        return city;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberOfFlat() {
        return numberOfFlat;
    }

    public Address(String city, int numberOfHouse, String street, int numberOfFlat) {
        this.city = city;
        this.numberOfHouse = numberOfHouse;
        this.street = street;
        this.numberOfFlat = numberOfFlat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (numberOfHouse != address.numberOfHouse) return false;
        if (numberOfFlat != address.numberOfFlat) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        return street != null ? street.equals(address.street) : address.street == null;
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + numberOfHouse;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + numberOfFlat;
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", numberOfHouse=" + numberOfHouse +
                ", street='" + street + '\'' +
                ", numberOfFlat=" + numberOfFlat +
                '}';
    }
}
