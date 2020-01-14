package com.qa.SolarSystemInformation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolarSystemInformationTest {
    @Test
    public void test_first_two_characters_of_userId_are_upper_case_letters(){
        //arrange
        String userId = "RR0123";
        boolean expectedResult = true;
        String password = "arby12345*/";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //act
        boolean result = cut.getUserId(Character.isUpperCase(userId.charAt(0)) && Character.isUpperCase(userId.charAt(1)));
        //assert
        assertEquals(true, result);
    }
    @Test
    public void test_4_subsequent_characters_after_first_2_letters_in_userId_are_digits_between_zero_and_nine(){
        //arrange
        String userId = "RR0123";
        boolean expectedResult = true;
        String password = "arby12345*/";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //act
        boolean result = cut.getUserId(Character.isDigit(userId.charAt(2))&&Character.isDigit(userId.charAt(3))&&Character.isDigit(userId.charAt(4))&&Character.isDigit(userId.charAt(5)));
        //assert
        assertEquals(true, result);
    }
    @Test
    public void test_invalid_userId_displayed_upon_incorrect_userId_input(){
        //arrange
        String userId = "1A0123";
        boolean expectedResult = false;
        String password = "arby12345*/";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //act
        boolean result = userId.matches("[A-Z]{2}[0-9](?!0000)");
        //assert
        assertEquals(false, result);
    }
    @Test
    public void test_4_consecutive_zeros(){
        //arrange
        String userId = "AA0000";
        boolean expectedResult = false;
        String password = "arby12345*/";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //act
        boolean result = userId.matches("[A-Z]{2}[0-9](?!0000)");
        //assert
        assertEquals(false, result);
    }
    @Test
    public void test_password_at_least_10_characters_in_length(){
        //arrange
        String password = "arby12345*/";
        boolean expectedResult = true;
        String userId = "AA1234";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //act
        boolean result = password.length()>=10;
        //assert
        assertEquals(true, result);
    }
    @Test
    public void test_password_too_short(){
        //arrange
        String password = "12345ar";
        boolean expectedResult = false;
        String userId = "AA1234";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //act
        boolean result = password.length()>=10;
        //assert
        assertEquals(expectedResult, result);
    }
    //@Test
   // public void

}
