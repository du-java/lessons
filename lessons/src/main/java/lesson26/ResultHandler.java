package lesson26;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResultHandler extends DefaultHandler {

    private String value;
    private Student student;
    private List<Student> students;
    private List<Test> tests;

    private enum Tags {
        STUDENT, TESTS, TEST, LOGIN, RESULTS, STUDENTS, GROUP, LASTNAME, FIRSTNAME
    }

    @Override
    public void startElement(String uri, String localName, String tag, Attributes attributes) throws SAXException {
        switch (Tags.valueOf(tag.toUpperCase())) {
            case STUDENTS:
                students = new ArrayList<>();
                break;
            case STUDENT:
                student = new Student();
                student.setId(Integer.parseInt(attributes.getValue("id")));
                break;
            case TESTS:
                tests = new ArrayList<>();
                break;
            case TEST:
                final Test test = new Test();
                test.setName(attributes.getValue("name"));
                test.setDate(LocalDate.parse(attributes.getValue("date")));
                test.setMark(Double.parseDouble(attributes.getValue("mark")));
                tests.add(test);
                break;
            case LOGIN:
                student.setFirstname(attributes.getValue("firstname"));
                student.setLastname(attributes.getValue("lastname"));
        }
    }

    @Override
    public void endElement(String uri, String localName, String tag) throws SAXException {
        final Tags tags = Tags.valueOf(tag.toUpperCase());
        switch (tags) {
            case FIRSTNAME:
                if (student.getFirstname().equals(value)) {
                    student.setFirstname(value.toUpperCase());
                }
                break;
            case LASTNAME:
                if (student.getLastname().equals(value)) {
                    student.setLastname(value.toUpperCase());
                }
                break;
            case STUDENT:
                students.add(student);
                break;
            case LOGIN:
                student.setLogin(value);
                break;
            case GROUP:
                student.setGroup(value);
                break;
            case TESTS:
                student.setTests(tests);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        value = new String(ch, start, length);
    }

    public List<Student> read(InputStream xml) {
        try {
            final SAXParser parser = SAXParserFactory
                    .newInstance()
                    .newSAXParser();

            parser.parse(xml, this);
            return students;

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.err.println(ex.getMessage());
            return Collections.emptyList();
        }
    }
}
