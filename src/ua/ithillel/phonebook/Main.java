package ua.ithillel.phonebook;

import ua.ithillel.phonebook.TelephoneDirectory;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory test = new TelephoneDirectory();
        test.add("Volkov", "111-111-11-11");
        test.add("Gerhard", "2500");
        test.add("Danilov", "1000");
        test.add("Volkov", "11111-1-11-11");

        System.out.println(test.find("Volkov"));

        System.out.println(test.findAll("Volkov"));
    }
}
