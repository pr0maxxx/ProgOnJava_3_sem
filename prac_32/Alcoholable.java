package ru.maksim.ikbo2021.new_pracs.prac_32;

import java.io.Serializable;

public interface Alcoholable extends Serializable {
    boolean isAlcoholicDrink();
    double getAlcoholVol();
}