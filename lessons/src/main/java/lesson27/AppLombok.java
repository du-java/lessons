package lesson27;

import lesson27.lombok.Car;
import lesson27.lombok.Wallet;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AppLombok {
    public static void main(String[] args) {
        log.info("starting app");

        Wallet wallet = Wallet.builder().amount(10).build();
        log.info("wallet: {}", wallet);
        wallet = wallet.withAmount(13);
        log.info("wallet: {}", wallet);


        final Car car = Car.builder().power(100).doors(5).name("car").build();
        log.info("car: {}", car);
        car
                .setDoors(3)
                .setName("car1");
        log.info("car: {}", car);

    }
}

