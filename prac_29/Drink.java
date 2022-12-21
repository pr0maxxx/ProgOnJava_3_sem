package ru.maksim.ikbo2021.new_pracs.prac_29;

import java.util.Objects;

final class Drink implements Item {
    private final int iPrice;
    private final String stName;
    private final String stDiscription;

    Drink(int iPrice, String stName, String stDiscription) {
        if (!stDiscription.isEmpty() && iPrice >= 0 && !stName.isEmpty()) {
            this.stDiscription = stDiscription;
            this.iPrice = iPrice;
            this.stName = stName;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getCost() {
        return this.iPrice;
    }

    public String getName() {
        return this.stName;
    }

    public String getDiscription() {
        return this.stDiscription;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj != null && obj.getClass() == this.getClass()) {
            Drink that = (Drink)obj;
            return this.iPrice == that.iPrice && Objects.equals(this.stName, that.stName) && Objects.equals(this.stDiscription, that.stDiscription);
        } else {
            return false;
        }
    }

    public String toString() {
        return "Drink[iPrice=" + this.iPrice + ", stName=" + this.stName + ", stDiscription=" + this.stDiscription + "]";
    }
}