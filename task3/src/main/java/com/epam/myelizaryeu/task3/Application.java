package com.epam.myelizaryeu.task3;

import com.epam.myelizaryeu.task3.elements.Tariff;

import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {
        XmlValidator validator = new XmlValidator();

        String xsdFileName = "tariff.xsd";
        String xmlFileName = "tariff.xml";
        String newXmlFileName = "src\\main\\java\\com\\epam\\myelizaryeu\\task3\\data\\tariff-new.xml";

        if (validator.validate(xmlFileName, xsdFileName)) {
            System.out.println("XML successfully validated");

            TariffXmlReader reader = new TariffXmlReader();
            List<Tariff> tariffs = reader.read(xmlFileName);

            tariffs.sort(new TariffComparator());
            for (Tariff tariff : tariffs) {
                System.out.println(tariff);
            }

            TariffXmlWriter writer = new TariffXmlWriter();
            writer.write(tariffs, newXmlFileName);

        } else {
            System.out.println("Failed to validate");
        }
    }
}
