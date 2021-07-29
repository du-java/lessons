package lesson48.creational.builder;

public class Car {
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private String name5;

  private Car(String name1, String name2, String name3, String name4, String name5) {
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.name5 = name5;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private String name1;
        private String name2;
        private String name3;
        private String name4;
        private String name5;

        CarBuilder() {
        }

        public CarBuilder name1(String name1) {
            this.name1 = name1;
            return this;
        }

        public CarBuilder name2(String name2) {
            this.name2 = name2;
            return this;
        }

        public CarBuilder name3(String name3) {
            this.name3 = name3;
            return this;
        }

        public CarBuilder name4(String name4) {
            this.name4 = name4;
            return this;
        }

        public CarBuilder name5(String name5) {
            this.name5 = name5;
            return this;
        }

        public Car build() {
            return new Car(name1, name2, name3, name4, name5);
        }

    }
}
