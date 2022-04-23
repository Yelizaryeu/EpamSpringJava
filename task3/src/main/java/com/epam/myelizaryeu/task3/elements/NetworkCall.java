package com.epam.myelizaryeu.task3.elements;

public class NetworkCall extends CallPrice {

    private Double price;

    public NetworkCall() {
        super("Call within the network");
    }

    @Override
    public String getValue() {
        return String.valueOf(price);
    }

    @Override
    public void setValue(String value) {
        price = Double.valueOf(value);
    }

    @Override
    public String toString() {
        return "NetworkCall{" +
                "value='" + getValue() + '\'' +
                '}';
    }
}
