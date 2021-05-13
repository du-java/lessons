package lesson26;

import java.util.List;

public class App {
    public static void main(String[] args) {
        final boolean isValid = XmlValidator.validate("resources/results.xml", "resources/results.xsd");
        System.out.println(isValid ? "XML is valid" : "XML is not valid");

        final ResultHandler resultHandler = new ResultHandler();
        final List<Student> students = resultHandler.read("resources/students/results.xml");

        System.out.println(students);
    }
}
