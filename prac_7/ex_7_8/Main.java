package ru.maksim.ikbo2021.new_pracs.prac_7.ex_7_8;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Pushkin", "1824");
        Book book2 = new Book("Pushkin", "1815");
        Magazine shop1 = new Magazine("Modeler", "autumn");
        Magazine shop2 = new Magazine("Modeler", "winter");

        Printable[] printables = {book1,book2,shop1,shop2};
        Book.printBooks(printables);
        Magazine.printMagazines(printables);
    }
}
