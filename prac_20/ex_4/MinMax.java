package ru.maksim.ikbo2021.new_pracs.prac_20.ex_4;


public class MinMax<T extends Comparable> {
    private T[] arMinMax;

    public MinMax(T[] arMinMax) {
        this.arMinMax = arMinMax;
    }

    public T findMin() {
        if (this.arMinMax.length == 0) {
            return null;
        } else {
            T min = this.arMinMax[0];

            for(int i = 1; i < this.arMinMax.length; ++i) {
                if (this.arMinMax[i].compareTo(min) < 0) {
                    min = this.arMinMax[i];
                }
            }

            return min;
        }
    }

    public T findMax() {
        if (this.arMinMax.length == 0) {
            return null;
        } else {
            T max = this.arMinMax[0];

            for(int i = 1; i < this.arMinMax.length; ++i) {
                if (this.arMinMax[i].compareTo(max) > 0) {
                    max = this.arMinMax[i];
                }
            }

            return max;
        }
    }
}