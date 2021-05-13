package lesson26;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        final boolean isValid = XmlValidator.validate("resources/results.xml", "resources/results.xsd");
        System.out.println(isValid ? "XML is valid" : "XML is not valid");

        final ResultHandler resultHandler = new ResultHandler();
        final List<Student> students = resultHandler.read("resources/students/results.xml");

        System.out.println(students);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JSR310Module());
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        final String xml = xmlMapper.writeValueAsString(students);

        System.out.println(xml);

        final Results result = xmlMapper.readValue(Paths.get("resources/students/results.xml").toFile(), Results.class);

        System.out.println(result.getStudents());

    }
}
