package ru.maksim.ikbo2021.pracs.pr_1;

public class Test_pr_1 {
    public static void main(String[] args) {
        System.out.println("Dog");
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog();
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d1.toHumanAge());
        System.out.println(d2.toHumanAge());
        System.out.println(d3.toHumanAge());

        System.out.println("Ball");
        Ball b1 = new Ball(10, "blue", 0);
        Ball b2 = new Ball();
        b2.setRadius(1);
        System.out.println(b1);
        b1.setCondition(1);
        System.out.println(b1.getCondition());

        System.out.println("Book");
        Book bk1 = new Book("Обломов", "И.А. Гончаров", 1899, 200);
        Book bk2 = new Book();
        bk2.setAuthor("Bob");
        System.out.println(bk1);
        System.out.println(bk2.getYear());
    }
}
