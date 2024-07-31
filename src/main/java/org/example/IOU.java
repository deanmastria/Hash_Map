package org.example;

import java.util.HashMap;
import java.util.Map;

public class IOU {
    // HashMap to store the person and the amount owed to them
    private Map<String, Double> debts;

    // Constructor to initialize the IOU
    public IOU() {
        debts = new HashMap<>();
    }

    // Method to set the amount owed to a person
    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    // Method to get the amount owed to a specific person
    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0);
    }

    // Main method for testing
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30.0);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        mattsIOU.setSum("Arthur", 10.5);  // Updating the amount owed to Arthur

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }
}
