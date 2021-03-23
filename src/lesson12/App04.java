package lesson12;

public class App04 {
    public static void main(String[] args) {

//        Car bmwX3Grey250 = new Car("bmw", "x3", "grey", 250);
//        Car bmwX5Red350 = new Car("bmw", "x5", "red", 350);
//        Car bmwX1White150 = new Car("bmw", "x1", "white", 150);

        Car bmwX5Red350 = CarFactory.getInstance(CarFactory.CarModel.X5);

    }

}
