package com.epam.myelizaryeu.task3.elements;

public class FavoriteNumber extends Parameter {

    private Integer amount;

    public FavoriteNumber() {
        super("Favorite numbers amount");
    }

    @Override
    public String getValue() {
        return String.valueOf(amount);
    }

    @Override
    public void setValue(String value) {
        amount = Integer.parseInt(value);
    }

    @Override
    public String toString() {
        return "FavoriteNumber{" +
                "value='" + getValue() + '\'' +
                '}';
    }
}
