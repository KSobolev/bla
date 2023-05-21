package com.sobolev;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        RemovingPage removePage = new RemovingPage();

        File file = new File("G:\\Паспорт_Кирилл_fix.pdf");

        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.setExecutable(true);
        file.setReadable(true);
        file.setWritable(true);


        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());


        try {
            removePage.RemovePage(file, 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}