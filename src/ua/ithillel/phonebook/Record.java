package ua.ithillel.phonebook;

public class Record {
    private String lastName;
    private String phoneNumber;

    public Record(String lastName, String phoneNumber) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Record {" +
                "lastName : '" + lastName + '\'' +
                ", phoneNumber : " + phoneNumber +
                '}';
    }
}
