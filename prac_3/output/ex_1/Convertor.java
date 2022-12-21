package ru.maksim.ikbo2021.new_pracs.prac_3.output.ex_1;

public class Convertor {
    public double SumInRub;
    public Convertor(double sm)
    {
        SumInRub = sm;
    }
    public double Euro()
    {
        return SumInRub / 59;
    }
    public double Dollar()
    {
        return SumInRub / 60;
    }
}
