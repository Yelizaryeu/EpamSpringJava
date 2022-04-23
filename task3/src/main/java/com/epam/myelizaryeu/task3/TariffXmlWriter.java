package com.epam.myelizaryeu.task3;

import com.epam.myelizaryeu.task3.elements.CallPrice;
import com.epam.myelizaryeu.task3.elements.Parameter;
import com.epam.myelizaryeu.task3.elements.Tariff;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class TariffXmlWriter {
    public void write(List<Tariff> tariffs, String fileName) throws FileNotFoundException, XMLStreamException {
        XMLStreamWriter writer = null;
        try {
            XMLOutputFactory factory = XMLOutputFactory.newFactory();
            writer = factory.createXMLStreamWriter(new FileOutputStream(fileName), "UTF-8");
            writer.writeStartDocument("UTF-8", "1.0");
            writer.writeCharacters("\n");
            writer.writeStartElement("tariffs");
            writer.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            writer.writeAttribute("\n\txmlns", "http://www.myelizaryeu.epam.com/tariffs");
            writer.writeAttribute("xsi:schemaLocation", "http://www.myelizaryeu.epam.com/tariffs tariff.xsd");
            for (Tariff tariff : tariffs) {
                writer.writeCharacters("\n\t");
                writer.writeStartElement("tariff");
                writer.writeAttribute("id", tariff.getId());
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("name");
                writer.writeCharacters(tariff.getName());
                writer.writeEndElement();
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("operator-name");
                writer.writeCharacters(tariff.getOperatorName());
                writer.writeEndElement();
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("payroll");
                writer.writeCharacters(String.valueOf(tariff.getPayroll()));
                writer.writeEndElement();
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("sms-price");
                writer.writeCharacters(String.valueOf(tariff.getSmsPrice()));
                writer.writeEndElement();
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("call-prices");
                for (CallPrice price : tariff.getCallPrices()) {
                    writer.writeCharacters("\n\t\t\t");
                    writer.writeStartElement(price.getElement());
                    writer.writeCharacters(price.getValue());
                    writer.writeEndElement();
                }
                writer.writeEndElement();
                writer.writeCharacters("\n\t\t");
                writer.writeStartElement("parameters");
                for (Parameter parameter : tariff.getParameters()) {
                    writer.writeCharacters("\n\t\t\t");
                    writer.writeStartElement(parameter.getElement());
                    writer.writeCharacters(parameter.getValue());
                    writer.writeEndElement();
                }
                writer.writeCharacters("\n\t\t");
                writer.writeEndElement();
                writer.writeCharacters("\n\t");
                writer.writeEndElement();
            }
            writer.writeCharacters("\n");
            writer.writeEndElement();
            writer.writeEndDocument();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
            }
        }
    }
}
