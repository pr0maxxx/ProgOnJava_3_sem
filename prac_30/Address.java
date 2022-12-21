package ru.maksim.ikbo2021.new_pracs.prac_30;

public final class Address {
    private final String cityName;
    private final String streetName;
    private final int zipCode;
    private final int buildNum;
    private final int apartmentNum;
    private final char buildLetter;
    public static final Address EMPTY_ADDRESS = new Address("", 0, "", 0, 0);

    public Address(String cityName, int zipCode, String streetName, int buildNum, int apartmentNum, char buildCorp) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.apartmentNum = apartmentNum;
        this.buildNum = buildNum;
        this.buildLetter = buildCorp;
    }

    public Address(String cityName, int zipCode, String streetName, int buildNum, int apartmentNum) {
        this(cityName, zipCode, streetName, buildNum, apartmentNum, ' ');
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public int getApartmentNum() {
        return this.apartmentNum;
    }

    public int getBuildNum() {
        return this.buildNum;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public char getBuildLetter() {
        return this.buildLetter;
    }
}
