package com.sobolev;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

public class RemovingPage {

    public void RemovePage(File file, int page) throws IOException {

        PDDocument document = PDDocument.load(file);
        int noOfPages = document.getNumberOfPages();
        System.out.println(noOfPages);

        // Removing the pages
        document.removePage(page);

        System.out.println("page removed");
        // Saving the document
        document.save(file);

        // Closing the document
        document.close();
    }
}
