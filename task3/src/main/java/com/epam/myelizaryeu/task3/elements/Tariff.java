package com.epam.myelizaryeu.task3.elements;

import java.util.LinkedHashSet;
import java.util.Set;

public class Tariff {

    private String id;
    private String name;
    private String operatorName;
    private double payroll;
    private double smsPrice;
    private Set<CallPrice> callPrices = new LinkedHashSet<>();
    private Set<Parameter> parameters = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public double getPayroll() {
        return payroll;
    }

    public void setPayroll(double payroll) {
        this.payroll = payroll;
    }

    public double getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(double smsPrice) {
        this.smsPrice = smsPrice;
    }

    public Set<CallPrice> getCallPrices() {
        return callPrices;
    }

    public Set<Parameter> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", payroll=" + payroll +
                ", smsPrice=" + smsPrice +
                ", callPrices=" + callPrices +
                ", parameters=" + parameters +
                '}';
    }
}
