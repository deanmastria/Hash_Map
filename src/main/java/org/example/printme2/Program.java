package org.example.printme2;

import java.util.HashMap;

public class Program {

    public static void printValues(HashMap<String, Book> hashmap) {
        // Iterate through all values (Books) in the HashMap
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        // Iterate through all values (Books) in the HashMap
        for (Book book : hashmap.values()) {
            // Check if the book's name contains the given text
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        //New HashMap to store books
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and Prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }
}

class Book {
    private String name;
    private int publishingYear;
    private String contents;

    public Book(String name, int publishingYear, String contents) {
        this.name = name;
        this.publishingYear = publishingYear;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "Name: " + name + " (" + publishingYear + ")\nContents: " + contents;
    }
}
