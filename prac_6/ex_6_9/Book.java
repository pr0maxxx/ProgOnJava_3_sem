package ru.maksim.ikbo2021.new_pracs.prac_6.ex_6_9;

class Book implements Printable{

    private String Author;
    private String Date;
    private String Summary;

    public Book(String author, String date) {
        Author = author;
        Date = date;
    }

    @Override
    public void print(){
        System.out.println("\nAuthor: " + Author + "\nDate: " + Date);
    }

}