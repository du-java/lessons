package lesson26;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.IOException;

public class XmlValidator {

    public static boolean validate(String xml, String xsd) {
        try {
            final SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            final Schema schema = factory.newSchema(new StreamSource(xsd));
            final Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xml));
            return Boolean.TRUE;
        } catch (SAXException | IOException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

    public static boolean validate2(String xml, String xsd) {
        try {
            SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
                    .newSchema(new StreamSource(xsd))
                    .newValidator()
                    .validate(new StreamSource(xml));

            return true;
        } catch (SAXException | IOException ex) {
            return false;
        }
    }
}

