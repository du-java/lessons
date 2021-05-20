package lesson27.equal;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Stream;

public final class EqualService {

    public boolean equals(Object o1, Object o2) {
        if (o1 == o2) {
            return true;
        }

        if (o1 == null || o2 == null) {
            return false;
        }

        if (o1.getClass() != o2.getClass()) {
            return false;
        }

        final boolean isEqual = getAllFieldsBy(o1, CompareBy.REFERENCE)
                .allMatch(field -> compareByReference(field, o1, o2));

        if (!isEqual) {
            return false;
        }

        return getAllFieldsBy(o1, CompareBy.VALUE)
                .allMatch(field -> compareByValue(field, o1, o2));
    }

    private boolean compareByValue(Field field, Object obj1, Object obj2) {
        try {
            final boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            final Object o1 = field.get(obj1);
            final boolean isEqual;
            if (o1 != null) {
                isEqual = o1.equals(field.get(obj2));
            } else {
                isEqual = field.get(obj2) == null;
            }
            field.setAccessible(isAccessible);
            return isEqual;
        } catch (IllegalAccessException ex) {
            throw new IllegalStateException(ex);
        }
    }

    private Stream<Field> getAllFieldsBy(Object obj, CompareBy compareBy) {
        return Arrays.stream(obj.getClass().getDeclaredFields())
                .filter(x -> x.isAnnotationPresent(Equal.class))
                .filter(x -> x.getAnnotation(Equal.class).value() == compareBy);
    }

    private boolean compareByReference(Field field, Object obj1, Object obj2) {
        try {
            final boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            final boolean isEqual = field.get(obj1) == field.get(obj2);
            field.setAccessible(isAccessible);
            return isEqual;
        } catch (IllegalAccessException ex) {
            throw new IllegalStateException(ex);
        }
    }

}
