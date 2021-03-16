package lesson10;


public class App01 {
    public static void main(String[] args) {
        ShukaRiverFish shukaRiverFish = new ShukaRiverFish(33);
        KarpRiverFish karpRiverFish = new KarpRiverFish();
        Eagle eagle = new Eagle();
        Parrot parrot = new Parrot();
        karpRiverFish.swim();

        Animal[] animals = new Animal[10];
        animals[0] = shukaRiverFish;
        animals[1] = karpRiverFish;
        animals[2] = eagle;
        animals[3] = parrot;
        //   Animal animal = animals[0];
        for (Animal animal : animals) {
            if (animal == null) continue;
            animal.eat();
            if (animal instanceof Swimable) {
                Swimable fish = (Swimable) animal;
                fish.swim();
            }
            if (animal instanceof AbstractBird){
                AbstractBird fly = (AbstractBird) animal;
                fly.fly();
            }
        }
    }
}
