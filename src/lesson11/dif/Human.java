package lesson11.dif;

public /*final*/ class Human {

    private final String name;

    public Human(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }
}
