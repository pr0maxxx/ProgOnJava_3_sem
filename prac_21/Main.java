package ru.maksim.ikbo2021.new_pracs.prac_21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<File> alFiles = findFiles("D:/Java_DZ/src/ru/maksim/ikbo2021/pract21");

        int i;
        for(i = 0; i < alFiles.size() && i < 5; ++i) {
            System.out.println(((File)alFiles.get(i)).getName());
        }

        for(i = 0; i < alFiles.size() && i < 5; ++i) {
            PrintStream var10000 = System.out;
            Object var10001 = alFiles.get(i);
            var10000.println("!---File: " + ((File)var10001).getName() + "---!\n");
            System.out.println(readFile((File)alFiles.get(i)));
            System.out.println();
        }

    }

    public static ArrayList<File> findFiles(String stPAth) throws IOException {
        ArrayList<File> alFiles = new ArrayList();
        Iterator var2 = Files.walk(Paths.get(stPAth)).filter((x$0) -> {
            return Files.isRegularFile(x$0, new LinkOption[0]);
        }).toList().iterator();

        while(var2.hasNext()) {
            Path path = (Path)var2.next();
            alFiles.add(new File(path.toUri()));
        }

        return alFiles;
    }

    public static String readFile(File file) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(file);
        String stResult = "";

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String line;
            try {
                while((line = bufferedReader.readLine()) != null) {
                    stResult = stResult + line;
                    stResult = stResult + "\n";
                }
            } catch (Throwable var7) {
                try {
                    bufferedReader.close();
                } catch (Throwable var6) {
                    var7.addSuppressed(var6);
                }

                throw var7;
            }

            bufferedReader.close();
            return stResult;
        } catch (IOException var8) {
            throw new RuntimeException(var8);
        }
    }
}
