package ru.maksim.ikbo2021.new_pracs.prac_7.ex_7_8;

class Magazine implements Printable {
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

    static void printMagazines(Printable[] printable){
        System.out.println("Magazines in list: ");
        for(Printable print: printable){
            if (print instanceof Magazine)
                print.print();
        }
    }
}