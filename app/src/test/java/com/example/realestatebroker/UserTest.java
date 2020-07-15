package com.example.realestatebroker;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import com.example.realestatebroker.User;

public class UserTest {
    User user = new User("ALI","AHMED","aA!12341234","0555555555","test@hello.com");
    @Test
    public void getFirstName() {
        assertEquals("ALI",user.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals("AHMED",user.getLastName());
    }

    @Test
    public void getPassword() {
    }

    @Test
    public void getDateOfBirth() {
    }

    @Test
    public void getDateOfRegisteration() {
    }

    @Test
    public void getPhoneNumbers() {
    }

    @Test
    public void getEmails() {
    }

    @Test
    public void getPreferences() {
    }

    @Test
    public void getCreditCards() {
    }

    @Test
    public void isActivated() {
    }

    @Test
    public void isVerified() {
    }

    @Test
    public void setFirstNameName() {
    }

    @Test
    public void setLastName() {
    }

    @Test
    public void isNameValid() {
        try{
            User.isNameValid("ALI1");
            Assert.fail("Should have thrown exception");
        } catch (IllegalArgumentException e){
            assertEquals("The name should only include letters", e.getMessage());
        }
    }

    @Test
    public void setPassword() {
    }

    @Test
    public void isPasswordValid() {
        try{
            User.isPasswordValid("1234");
            Assert.fail("Should have thrown exception");
        } catch (IllegalArgumentException e){
            assertEquals("The password should be at least 8 char", e.getMessage());
        }

        try{
            User.isPasswordValid("12345123451234512345123451234512345123455124");
            Assert.fail("Should have thrown exception");
        } catch (IllegalArgumentException e){
            assertEquals("The password should be at most 24 char", e.getMessage());
        }

        try{
            User.isPasswordValid("12345123445123455124");
            Assert.fail("Should have thrown exception");
        } catch (IllegalArgumentException e){
            assertEquals("The password should have small char", e.getMessage());
        }

        try{
            User.isPasswordValid("a12345123445123455124");
            Assert.fail("Should have thrown exception");
        } catch (IllegalArgumentException e){
            assertEquals("The password should have cap char", e.getMessage());
        }

    }

    @Test
    public void setDateOfBirth() {
    }

    @Test
    public void setDateOfRegisteration() {
    }

    @Test
    public void setActivated() {
    }

    @Test
    public void setVerified() {
    }

    @Test
    public void addPreference() {
    }

    @Test
    public void addCreditCard() {
    }

    @Test
    public void addPhoneNumber() {
    }

    @Test
    public void isPhoneNumberValid() {
    }

    @Test
    public void addEmail() {
    }

    @Test
    public void isEmailValid() {
    }

    @Test
    public void removePreference() {
    }

    @Test
    public void removeCreditCard() {
    }

    @Test
    public void removePhoneNumber() {
    }

    @Test
    public void removeEmail() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testClone() {
    }

}