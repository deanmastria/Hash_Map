package org.example.printme1;

import java.util.HashMap;

public class Program {

    // Method print all the keys in the given hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    // Method print the keys in the hashmap that contain given text
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // Method to print the values in the hashmap whose keys contain given text
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    // Main method for testing the implemented methods
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        System.out.println("All keys:");
        printKeys(hashmap);
        System.out.println("---");

        System.out.println("Keys containing 'i':");
        printKeysWhere(hashmap, "i");
        System.out.println("---");

        System.out.println("Values of keys containing '.e':");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}
