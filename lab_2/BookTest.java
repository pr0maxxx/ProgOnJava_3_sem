package ru.maksim.ikbo2021.labs.lab_2;

public class BookTest {
    public static void main(String[] args) {
        System.out.println("BookTest");
        Book bk1 = new Book("Обломов", "И.А. Гончаров", 1899, 200);
        Book bk2 = new Book();
        bk2.setAuthor("Bob");
        System.out.println(bk1);
        System.out.println(bk2.getYear());
    }
}
