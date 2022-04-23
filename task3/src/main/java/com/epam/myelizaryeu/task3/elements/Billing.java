package com.epam.myelizaryeu.task3.elements;

public class Billing extends Parameter {

    private BillingType billingType;

    public Billing() {
        super("Billing");
    }

    @Override
    public String getValue() {
        return billingType.toString();
    }

    @Override
    public void setValue(String value) {
        billingType = BillingType.valueOf(value);
    }

    @Override
    public String toString() {
        return "Billing{" +
                "value='" + getValue() + '\'' +
                '}';
    }
}
