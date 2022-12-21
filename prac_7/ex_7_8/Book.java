package ru.maksim.ikbo2021.new_pracs.prac_7.ex_7_8;

class Book implements Printable {

    private String Author;
    private String Date;

    public Book(String author, String date) {
        Author = author;
        Date = date;
    }

    @Override
    public void print(){
        System.out.println("\nAuthor: " + Author + "\nDate: " + Date);
    }

    static void printBooks(Printable[] printable){
        System.out.println("Books in list: ");
        for(Printable print: printable){
            if (print instanceof Book)
                print.print();
        }
    }
}