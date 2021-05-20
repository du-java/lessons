package lesson27;

import lesson27.equal.ClassForEqual;
import lesson27.equal.EqualService;

public class AppEqual {
    public static void main(String[] args) {
        final ClassForEqual obj1 = new ClassForEqual(1, "string1", "string2");
        final ClassForEqual obj2 = new ClassForEqual(2, "string1", "string2");
        final ClassForEqual obj3 = new ClassForEqual(3, "string1", "string3");
        final ClassForEqual obj4 = new ClassForEqual(4, new String("string1"), "string2");
        final ClassForEqual obj5 = new ClassForEqual(5, null, "string2");
        final ClassForEqual obj6 = new ClassForEqual(6, "string1", null);

        final EqualService equalService = new EqualService();

        System.out.println("---------------------------");
        System.out.printf("obj1 and obj1: %s\n", equalService.equals(obj1, obj1));
        System.out.printf("obj1 and null: %s\n", equalService.equals(obj1, null));
        System.out.printf("obj1 and Object: %s\n", equalService.equals(obj1, new Object()));
        System.out.printf("obj1 and obj2: %s\n", equalService.equals(obj1, obj2));
        System.out.printf("obj1 and obj3: %s\n", equalService.equals(obj1, obj3));
        System.out.printf("obj1 and obj4: %s\n", equalService.equals(obj1, obj4));
        System.out.printf("obj1 and obj5: %s\n", equalService.equals(obj1, obj5));
        System.out.printf("obj6 and obj1: %s\n", equalService.equals(obj6, obj1));
        System.out.printf("obj6 and obj6: %s\n", equalService.equals(obj6, obj6));
        System.out.println("---------------------------");
    }
}
