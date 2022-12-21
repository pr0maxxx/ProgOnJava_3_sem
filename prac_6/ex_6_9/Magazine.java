package ru.maksim.ikbo2021.new_pracs.prac_6.ex_6_9;

class Magazine implements Printable{
    private String Author;
    private String Season;

    public Magazine(String author, String season) {
        Author = author;
        Season = season;
    }

    @Override
    public void print(){
        System.out.println("\nAuthor: " + Author + "\nSeason: " + Season);
    }
}