package ru.maksim.ikbo2021.new_pracs.prac_6.ex_11;

class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double dbValue) {
        return 1.8 * dbValue + 32;
    }
}