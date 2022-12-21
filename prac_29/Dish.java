package ru.maksim.ikbo2021.new_pracs.prac_29;

import java.util.Objects;

public final class Dish implements Item {
    private final int iPrice;
    private final String stName;
    private final String stDiscription;

    Dish(int iPrice, String stName, String stDiscription) {
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
            Dish that = (Dish)obj;
            return this.iPrice == that.iPrice && Objects.equals(this.stName, that.stName) && Objects.equals(this.stDiscription, that.stDiscription);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.iPrice, this.stName, this.stDiscription});
    }

    public String toString() {
        return "Dish[iPrice=" + this.iPrice + ", stName=" + this.stName + ", stDiscription=" + this.stDiscription + "]";
    }
}
