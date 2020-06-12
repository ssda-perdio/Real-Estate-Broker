package com.example.realestatebroker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID ID;
    private String name;
    private List<String> phoneNumbers;
    private List<String> emails;
    private char[] password;
    private Date dateOfBirth;
    private Date dateOfRegisteration;
    private List<String> preferences;
    private List<String> creditCards;
    private boolean isActivated;
    private boolean isVerified;

    public User(String name, char[] password, final String phoneNumber, final String email, Date dateOfRegisteration){
        this.ID = UUID.randomUUID();
        this.name = name;
        this.password = password;
        this.phoneNumbers = new ArrayList<String>() {{ add(phoneNumber); } };
        this.emails = new ArrayList<String>() {{ add(email); } };
        this.dateOfRegisteration = dateOfRegisteration;
    }

    public UUID getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char[] getPassword() {
        return password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getDateOfRegisteration() {
        return dateOfRegisteration;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<String> getEmails() {
        return emails;
    }

    public List<String> getPreferences() {
        return preferences;
    }

    public List<String> getCreditCards() {
        return creditCards;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfRegisteration(Date dateOfRegisteration) {
        this.dateOfRegisteration = dateOfRegisteration;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    // need to check if there is is a list
    public void addPreference(String preferences) {
        this.preferences.add(preferences);
    }

    public void addCreditCard(String creditCards) {
        this.creditCards.add(creditCards);
    }

    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }

    public void addEmail(String email) {
        this.emails.add(email);
    }
    // need to check the index & if it is not len of oen
    public void removePreference(int index) {
        this.preferences.remove(index);
    }

    public void removeCreditCard(int index) {
        this.creditCards.remove(index);
    }

    public void removePhoneNumber(int index) {
        this.phoneNumbers.remove(index);
    }

    public void removeEmail(int index) {
        this.emails.remove(index);
    }
}
