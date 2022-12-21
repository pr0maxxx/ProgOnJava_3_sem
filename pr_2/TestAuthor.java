package ru.maksim.ikbo2021.pracs.pr_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Pushkin", "pushkin@mail.ru", 'm');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        a1.setEmail("newPushkin@yaandex.ru");
        System.out.println(a1);
    }
}
