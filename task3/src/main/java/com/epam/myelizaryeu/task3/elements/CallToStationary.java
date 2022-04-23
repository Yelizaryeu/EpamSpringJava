package com.epam.myelizaryeu.task3.elements;

public class CallToStationary extends CallPrice {

    private Double price;

    public CallToStationary() {
        super("Call to stationary phone");
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
        return "CallToStationary{" +
                "value='" + getValue() + '\'' +
                '}';
    }
}
