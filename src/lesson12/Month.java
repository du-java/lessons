package lesson12;

public enum Month {
    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar");

    private final String shortMonth;

    Month(String shortMonth) {
        this.shortMonth = shortMonth;
    }

    public String getShortMonth() {
        return shortMonth;
    }
}
