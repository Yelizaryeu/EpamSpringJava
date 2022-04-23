package com.epam.myelizaryeu.task3.elements;

public class OfflineCall extends CallPrice {

    private Double price;

    public OfflineCall() {
        super("Offline call");
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
        return "OfflineCall{" +
                "value='" + getValue() + '\'' +
                '}';
    }
}
