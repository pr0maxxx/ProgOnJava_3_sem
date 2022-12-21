package ru.maksim.ikbo2021.labs.lab_3;

public class ShopTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);
        shop.add(new Bed(20000, 2.5, 2.0, 1.2, "Brown",
                135222, 2,250,"Cloth"));
        System.out.println(shop.getPrices());
        System.out.println("Куплено: "+ shop.buy(3));
        System.out.println(shop.getPrices());

    }
}