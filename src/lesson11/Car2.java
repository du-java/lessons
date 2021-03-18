package lesson11;

import lesson11.car.Engine;
import lesson11.car.Gear;
import lesson11.car.Hood;

public class Car2 implements Transport {

    private Engine engine;
    private Gear gear;
    private Hood hood;

    public Car2(Engine engine, Gear gear, Hood hood) {
        this.engine = engine;
        this.gear = gear;
        this.hood = hood;
    }

    public Car2() {
    }

    @Override
    public void drive() {

    }

    public static class Builder {
        private Engine engine;
        private Gear gear;
        private Hood hood;

        public Builder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder gear(Gear gear) {
            this.gear = gear;
            return this;
        }

        public Builder hood(Hood hood) {
            this.hood = hood;
            return this;
        }

        public Car2 build() {
            Car2 car = new Car2();
            car.engine = this.engine;
            car.gear = this.gear;
            car.hood = this.hood;

            this.gear = null;
            this.hood = null;
            this.engine = null;
            return car;
        }
    }


}
