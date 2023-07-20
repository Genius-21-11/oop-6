package data;

import dataSet.Formater;

import java.util.List;

public class Format implements Formater {
    @Override
    public FoneBook formatPdf(FoneBook foneBook) {
        System.out.println("Смена формата на PDF");
        return foneBook;
    }

    @Override
    public FoneBook formatJson(FoneBook foneBook) {
        System.out.println("Смена формата на JSON");
        return foneBook;
    }
}