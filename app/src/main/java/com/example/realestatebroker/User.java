package com.example.realestatebroker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private String gender;
    private List<String> phoneNumbers;
    private List<String> emails;
    private char[] password;
    private Date dateOfBirth;
    private Date dateOfRegisteration;
    private List<String> preferences;
    private List<String> creditCards;
    private boolean isActivated;
    private boolean isVerified;

    public User(String firstName, String lastName, char[] password, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.addPhoneNumber(phoneNumber);
        this.addEmail(email);
        this.dateOfRegisteration = new Date();
    }

    public User(String firstName, String lastName, String gender, List<String> phoneNumbers,List<String> emails, char[] password,
                Date dateOfBirth, Date dateOfRegisteration, List<String> preferences, List<String> creditCards, boolean isActivated,
                boolean isVerified){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumbers = new ArrayList<String> (phoneNumbers);
        this.emails = new ArrayList<String>(emails);
        this.password = password; //to-do  fix the copy
        this.dateOfBirth = (Date)dateOfBirth.clone();
        this.dateOfRegisteration = (Date)dateOfRegisteration.clone();
        this.preferences = new ArrayList<String> (preferences);
        this.creditCards = new ArrayList<String>(creditCards);
        this.isActivated = isActivated;
        this.isVerified = isVerified;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
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
        return new ArrayList<String> (phoneNumbers);
    }

    public List<String> getEmails() {
        return new ArrayList<String> (emails);
    }

    public List<String> getPreferences() {
        return new ArrayList<String> (preferences);
    }

    public List<String> getCreditCards() {
        return new ArrayList<String> (creditCards);
    }

    public boolean isActivated() {
        return isActivated;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setFirstNameName(String name) {
        if (isNameLegal(name)) {
            this.firstName = name;
        }
    }

    public void setLastName(String name) {
        if (isNameLegal(name)) {
            this.lastName = name;
        }
    }

    public boolean isNameLegal(String name){
        if(name == null){
            throw new NullPointerException("NullPointerException");
        }
        String name_no_spaces = name.replaceAll(" ","");
        if(!name_no_spaces.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("The name should only include letters");
        }
        if(name_no_spaces.length() < 2){
            throw new IllegalArgumentException("The name should be longer than 1 letters");
        }
        if(name.length() > 24){
            throw new IllegalArgumentException("The name length should be less than 24");
        }
        return true;

    }

    public void setPassword(String password) {
        if(isPasswordLegal(password)){
            this.password = password.toCharArray();
        }
    }

    public boolean isPasswordLegal(String password){
        if(password == null){
            throw new NullPointerException("NullPointerException");
        }
        if(password.length()< 8){
            throw new IllegalArgumentException("The password should be at least 8 char");
        }
        if(password.length()> 24){
            throw new IllegalArgumentException("The password should be at most 24 char");
        }
        if(password.equals(password.toUpperCase())){
            throw new IllegalArgumentException("The password should have small char");
        }
        if(password.equals(password.toLowerCase())){
            throw new IllegalArgumentException("The password should have cap char");
        }
        if(password.matches(".*\\d.*")){
            throw new IllegalArgumentException("The password should have digit");
        }
        if(password.matches(".*[!@#$%^&*].*")){
            throw new IllegalArgumentException("The password should have Special char");
        }
        return true;
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
        if( this.preferences == null){
            this.preferences  = new ArrayList<String>();
        }
        this.preferences.add(preferences);
    }

    public void addCreditCard(String creditCards) {
        if( this.creditCards == null){
            this.creditCards  = new ArrayList<String>();
        }
        this.creditCards.add(creditCards);
    }

    public void addPhoneNumber(String phoneNumber) {
        if( this.phoneNumbers == null){
            this.phoneNumbers  = new ArrayList<String>();
        }
        this.phoneNumbers.add(phoneNumber);
    }

    public void addEmail(String email) {
        if( this.emails == null){
            this.emails  = new ArrayList<String>();
        }
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

    public String toString() {
        return firstName +" " +lastName + " " + gender + " . is Active?" + isActivated ;
    }

    public User clone() {
        return new User(this.firstName, this.lastName, this.gender, this.phoneNumbers, this.emails, this.password,
        this.dateOfBirth, this.dateOfRegisteration, this.preferences, this.creditCards, this.isActivated,
        this.isVerified);
    }
}
