package lesson08;

public class App02 {

    public static void main(String[] args) {
        System.out.println("name | age");
        System.out.println("Alex | 32");
        System.out.println("Bob | 34");
        System.out.println("John | 34");
        System.out.println("Vladimir | 36");

        String header = "name,age";
        String[] people = {
                "alex,32", "Bob,34", "John,34", "Vladimir,36"
        };
        System.out.println();
        String[] headers = header.split(",");
        String format = "%" + -10 + "s | %" + 10 + "s\n";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 23; i++) {
         stringBuilder.append("-");
        }
        System.out.println(stringBuilder.toString());
        System.out.printf(format, headers[0], headers[1]);
        System.out.println(stringBuilder.toString());
        for (String person : people) {
            String[] fields = person.split(",");
            System.out.printf(format, fields[0], fields[1]);
        }
        System.out.println(stringBuilder.toString());
    }
}
