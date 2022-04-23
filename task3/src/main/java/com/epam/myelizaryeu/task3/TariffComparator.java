package com.epam.myelizaryeu.task3;

import com.epam.myelizaryeu.task3.elements.Tariff;

import java.util.Comparator;

public class TariffComparator implements Comparator<Tariff> {

    @Override
    public int compare(Tariff t1, Tariff t2) {
        return Double.compare(t1.getPayroll(), t2.getPayroll());
    }
}
