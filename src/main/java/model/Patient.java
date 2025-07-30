package model;

import java.time.LocalDate;

public class Patient {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String email;
    private String mailingAddress;
    private LocalDate dateOfBirth;

    public Patient(int id, String firstName, String lastName, String phoneNo, String email, String mailingAddress, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.email = email;
        this.mailingAddress = mailingAddress;
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }
    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }
}
