package lesson26;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        final String xmlPath = App.class.getClassLoader().getResource("results.xml").getFile();
        final String xsdPath = App.class.getClassLoader().getResource("results.xsd").toString();
        final boolean isValid = XmlValidator.validate(xmlPath, xsdPath);
        System.out.println(isValid ? "XML is valid" : "XML is not valid");

        final ResultHandler resultHandler = new ResultHandler();
        final List<Student> students = resultHandler.read(new FileInputStream("results.xml"));

        System.out.println(students);

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.registerModule(new JSR310Module());
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        final String xml = xmlMapper.writeValueAsString(students);

        System.out.println(xml);
        final Results result = xmlMapper.readValue(new FileInputStream("results.xml"), Results.class);

        System.out.println(result.getStudents());
    }

//    private static InputStream getStudentXmlStream() {
//        return App.class.getClassLoader().getResourceAsStream("results.xml");
//    }
}
