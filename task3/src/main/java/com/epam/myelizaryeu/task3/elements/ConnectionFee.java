package com.epam.myelizaryeu.task3.elements;

public class ConnectionFee extends Parameter {

    private Double fee;

    public ConnectionFee() {
        super("Connection fee");
    }

    @Override
    public String getValue() {
        return String.valueOf(fee);
    }

    @Override
    public void setValue(String value) {
        fee = Double.valueOf(value);
    }

    @Override
    public String toString() {
        return "ConnectionFee{" +
                "value='" + getValue() + '\'' +
                '}';
    }
}
