package ru.maksim.ikbo2021.new_pracs.prac_30;

public enum DrinkTypeEnum {
    BEER("Alcohol"),
    VODKA("Alcohol"),
    WINE("Alcohol"),
    BRANDY("Alcohol"),
    TEQUILA("Alcohol"),
    RUM("Alcohol"),
    WHISKEY("Alcohol"),
    LIQUOR("Alcohol"),
    JUICE("Non-alcohol"),
    COFFEE("Non-alcohol"),
    TEA("Non-alcohol"),
    MILK("Non-alcohol"),
    WATER("Non-alcohol");

    String[] alco = new String[]{"BEER, VODKA, WINE, BRANDY, TEQUILA, RUM, WHISKEY, LIQUOR"};
    String type;

    private DrinkTypeEnum(String type) {
        this.type = type;
    }

    public static DrinkTypeEnum[] getAlcohol() {
        return new DrinkTypeEnum[]{BEER, VODKA, WINE, BRANDY, TEQUILA, RUM, WHISKEY, LIQUOR};
    }

    public boolean isAlcohol() {
        String[] var1 = this.alco;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            String t = var1[var3];
            if (this.type == t) {
                return true;
            }
        }

        return false;
    }

    public static DrinkTypeEnum[] getNonAlcohol() {
        return new DrinkTypeEnum[]{JUICE, COFFEE, TEA, MILK, WATER};
    }
}
