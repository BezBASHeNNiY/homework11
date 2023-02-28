package ua.ithillel.phonebook;

import java.util.ArrayList;

public class TelephoneDirectory {
    private static ArrayList<Record> records = new ArrayList<>();

    public void add(String lastName, String phoneNumber) {
        records.add(new Record(lastName, phoneNumber));
    }

    public Record find(String lastName) {
        Record record = null;

        for (Record element : records) {
            if (element.getLastName().equals(lastName)) {
                record = element;
            }
        }
        return record;
    }

    public ArrayList<Record> findAll(String lastName) {
        ArrayList<Record> record = new ArrayList<>();

        for (Record element : records) {
            if (element.getLastName().equals(lastName)) {
                record.add(element);
            }
        }
        return record;
    }

}