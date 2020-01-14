package com.qa.SolarSystemInformation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolarSystemInformationTest {
    @Test
    public void test_first_two_characters_of_userId_are_upper_case_letters(){
        //arrange
        String userId = "RR0123";
        boolean expectedResult = true;
        SolarSystemInformation cut = new SolarSystemInformation(userId);
        //act
        boolean result = cut.getUserId(Character.isUpperCase(userId.charAt(0)) && Character.isUpperCase(userId.charAt(1)));
        //assert
        assertEquals(true, result);
    }
    //@Test
    //public void test_4_subsequent_characters_after_first_2_letters_in_userId_are_digits_between_zero_and_nine(){}
    //@Test
    //public void test_4_consecutive_zeros_not_allowed_in_userId(){}
    //@Test
    //public void test_password_at_least_10_characters_in_length(){}
    //@Test
   // public void

}
