package lesson11;

import lesson10.AbstractFish;
import lesson10.KarpRiverFish;
import lesson10.Swimable;

public class App01 {
    public static void main(String[] args) {

        Swimable ship = new Swimable() {
            @Override
            public void swim() {
                System.out.println("ship is swimming");
            }
        };

        Swimable[] swimables = new Swimable[3];

        swimables[0] = new Swimable() {
            @Override
            public void swim() {
                System.out.println("ship is swimming");
            }
        };

        swimables[1] = new KarpRiverFish();
        swimables[2] = new AbstractFish() {
            @Override
            public void eat() {
                System.out.println("eat");
            }

            @Override
            public void swim() {
                System.out.println("swim");
            }
        };

        for (Swimable sw : swimables) {
            sw.swim();
        }


    }
}
