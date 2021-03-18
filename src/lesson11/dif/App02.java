package lesson11.dif;

public class App02 {
    public static void main(String[] args) {

        Transport[] transports = new Transport[2];

        transports[0] = new Car();

        Transport tractor_is_driving = () -> System.out.println("123");


        new Transport() {
            @Override
            public void drive() {
                System.out.println("tractor is driving");
            }
        };

        transports[1] = tractor_is_driving;

        transports[2] = new Transport() {
            @Override
            public void drive() {
                System.out.println("tractor is driving");
            }
        };
    }
}
