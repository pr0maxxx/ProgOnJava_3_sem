package ru.maksim.ikbo2021.pracs.pr_1;

public class Book {
    private String name;
    private String author;
    private int year;
    private int count_pages;

    public Book(String name, String author, int year, int count_pages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.count_pages = count_pages;
    }

    public Book() {
        this.name = "Война и мир";
        this.author = "Лев Николаевич Толстой";
        this.year = 1863;
        this.count_pages = 750;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCount_pages() {
        return count_pages;
    }

    public void setCount_pages(int count_pages) {
        this.count_pages = count_pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", count_pages=" + count_pages +
                '}';
    }
}
