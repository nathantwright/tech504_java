package org.example.clf;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int count = 3;
        String name;
        name = "Nathan";
        // name = 3; // WON'T WORK!
        String[] fruits = new String[]{"Oranges", "Bananas", "Pears"};
        String fruit3 = fruits[2];
        System.out.println(fruit3+"\n");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        LocalDate now = LocalDate.now();
        System.out.println("\n" + now);
        LocalDate christmas = LocalDate.of(2025, 12, 25);
        int daysToGo = christmas.getDayOfYear() - now.getDayOfYear();
        System.out.printf("Only %d days until Christmas", daysToGo);
    }
}
