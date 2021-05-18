package lesson14;

import java.util.Locale;

public class NewString {

    private final String value;

    public String getValue() {
        return value;
    }

    public NewString(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewString newString = (NewString) o;

        return value != null ? value.equalsIgnoreCase(newString.value) : newString.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.toUpperCase(Locale.ROOT).hashCode() : 0;
    }
}
