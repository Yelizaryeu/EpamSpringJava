package com.epam.myelizaryeu.task3;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class XmlValidator {

    public boolean validate(String xmlFileName, String xsdFileName) throws IOException, URISyntaxException {
        try {
            File xml = getFileFromResource(xmlFileName);
            File xsd = getFileFromResource(xsdFileName);

            if (!xml.exists()) {
                System.out.println("XML not found " + xmlFileName);
            }

            if (!xsd.exists()) {
                System.out.println("XSD not found " + xsdFileName);
            }

            if (!xml.exists() || !xsd.exists()) {
                return false;
            }

            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(getFileFromResource(xsdFileName)));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(getFileFromResource(xmlFileName)));

            return true;
        } catch (SAXException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private File getFileFromResource(String fileName) throws URISyntaxException {
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return new File(resource.toURI());
        }
    }
}
