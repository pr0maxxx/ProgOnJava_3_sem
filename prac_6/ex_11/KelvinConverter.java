package ru.maksim.ikbo2021.new_pracs.prac_6.ex_11;

class KelvinConverter implements Converter {

    @Override
    public double getConvertedValue(double dbValue) {
        return dbValue + 273;
    }
}