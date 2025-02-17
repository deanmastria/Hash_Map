package org.example;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;

    // Constructor
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    // Method add an abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    // Method check if an abbreviation exists
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    // Method to find the explanation
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.getOrDefault(abbreviation, null);
    }

    // Main method to test Abbreviations class
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("ex", "example");
        abbreviations.addAbbreviation("ie", "id est");
        abbreviations.addAbbreviation("eg", "exempli gratia");

        // Testing hasAbbreviation
        System.out.println("Has Abbreviation 'ex': " + abbreviations.hasAbbreviation("ex"));

        // Testing findExplanationFor
        System.out.println("Explanation for 'ie': " + abbreviations.findExplanationFor("ie"));
        System.out.println("Explanation for 'eg': " + abbreviations.findExplanationFor("eg"));

        // Testing a non-existing abbreviation
        System.out.println("Explanation for 'abc': " + abbreviations.findExplanationFor("abc"));
    }
}
