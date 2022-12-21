package ru.maksim.ikbo2021.labs.lab_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer{
    public static void main(String[] args) {
        try(FileWriter writer = new
                FileWriter("C:\\Users\\Maksim\\Desktop\\файлы для уника\\2 курс\\2 курс 1 семестр\\Программирование на Джава\\lab_8.txt", false))
        {
            Scanner scanner = new Scanner(System.in);
            // запись всей строки
            String text = scanner.nextLine();
            writer.write(text);
            scanner.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

