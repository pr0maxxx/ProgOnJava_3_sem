package ru.maksim.ikbo2021.new_pracs.prac_7.ex_4;

class mathFunc implements mathCalculate{

    public mathFunc(){}

    public double moduleOfComplex(double realPart, double imPart) {
        return Math.sqrt(realPart*realPart + imPart*imPart);
    }

    public double raisePower(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    public double areaOfCircle(double radius){
        return numPI*raisePower(radius, 2);
    }
}