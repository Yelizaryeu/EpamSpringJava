package com.epam.myelizaryeu.task3;

import com.epam.myelizaryeu.task3.elements.*;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TariffXmlReader {

    public List<Tariff> read(String fileName) throws FileNotFoundException, URISyntaxException {
        XMLStreamReader reader = null;
        try {
            List<Tariff> tariffs = new ArrayList<>();
            Tariff tariff = null;
            XMLInputFactory factory = XMLInputFactory.newFactory();
            reader = factory.createXMLStreamReader(new FileInputStream(getFileFromResource(fileName)));
            while (reader.hasNext()) {
                int type = reader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("tariff".equals(tagName)) {
                            tariff = new Tariff();
                            tariff.setId(reader.getAttributeValue(null, "id"));
                        } else if ("name".equals(tagName)) {
                            tariff.setName(reader.getElementText());
                        } else if ("operator-name".equals(tagName)) {
                            tariff.setOperatorName(reader.getElementText());
                        } else if ("payroll".equals(tagName)) {
                            tariff.setPayroll(Double.parseDouble(reader.getElementText()));
                        } else if ("sms-price".equals(tagName)) {
                            tariff.setSmsPrice(Double.parseDouble(reader.getElementText()));
                        } else if ("within".equals(tagName)) {
                            NetworkCall call = new NetworkCall();
                            call.setElement(tagName);
                            call.setValue(reader.getElementText());
                            tariff.getCallPrices().add(call);
                        } else if ("offline".equals(tagName)) {
                            OfflineCall call = new OfflineCall();
                            call.setElement(tagName);
                            call.setValue(reader.getElementText());
                            tariff.getCallPrices().add(call);
                        } else if ("station".equals(tagName)) {
                            CallToStationary call = new CallToStationary();
                            call.setElement(tagName);
                            call.setValue(reader.getElementText());
                            tariff.getCallPrices().add(call);
                        } else if ("favorite-numbers".equals(tagName)) {
                            FavoriteNumber favoriteNumber = new FavoriteNumber();
                            favoriteNumber.setElement(tagName);
                            favoriteNumber.setValue(reader.getElementText());
                            tariff.getParameters().add(favoriteNumber);
                        } else if ("billing".equals(tagName)) {
                            Billing billing = new Billing();
                            billing.setElement(tagName);
                            billing.setValue(reader.getElementText());
                            tariff.getParameters().add(billing);
                        } else if ("connection-fee".equals(tagName)) {
                            ConnectionFee fee = new ConnectionFee();
                            fee.setElement(tagName);
                            fee.setValue(reader.getElementText());
                            tariff.getParameters().add(fee);
                        }
                        break;
                    }
                    case XMLStreamConstants.END_ELEMENT: {
                        String tagName = reader.getLocalName();
                        if ("tariff".equals(tagName)) {
                            tariffs.add(tariff);
                        }
                        break;
                    }
                }
            }
            return tariffs;
        } catch (XMLStreamException e) {
            return null;
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
            }
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
