package com.example.realestatebroker;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void userPasswordLess8() {

        try{
            User user = new User("ALI","wweq","1234","05...","this is an email@hello.com");
            Assert.fail("Should have thrown exception");
        } catch (IllegalArgumentException e){
            assertEquals("The password should be at least 8 char", e.getMessage());
        }

//        try{
//            User user = new User("ALI1","wweq","1234","05...","this is an email@hello.com");
//            Assert.fail("Should have thrown exception");
//        } catch (IllegalArgumentException e){
//            assertEquals("The name should only include letters", e.getMessage());
//        }

    }
}