package ru.maksim.ikbo2021.new_pracs.prac_30;

public final class Customer {
    private final String firstName;
    private final String secondName;
    private final int age;
    Address address;
    private static final int MATURE_AGE = 18;
    public static final Customer MATURE_UNKNOWN_CUSTOMER;
    public static final Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public Customer(int age) {
        this("", "", age, Address.EMPTY_ADDRESS);
    }

    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        String var10000 = this.address.getCityName();
        String add = var10000 + ", code: " + this.address.getZipCode() + ", " + this.address.getStreetName() + " " + this.address.getBuildNum() + ", " + this.address.getApartmentNum();
        return add;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    static {
        MATURE_UNKNOWN_CUSTOMER = new Customer("", "", 18, Address.EMPTY_ADDRESS);
        NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("", "", 17, Address.EMPTY_ADDRESS);
    }
}
