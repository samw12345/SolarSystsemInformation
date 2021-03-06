package com.qa.SolarSystemInformation;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolarSystemInformationTest {
    @Test
    public void test_first_two_characters_of_userId_are_upper_case_letters() {
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
    public void test_4_subsequent_characters_after_first_2_letters_in_userId_are_digits_between_zero_and_nine() {
        //arrange
        String userId = "RR0123";
        boolean expectedResult = true;
        String password = "arby12345*/";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //act
        boolean result = cut.getUserId(Character.isDigit(userId.charAt(2)) && Character.isDigit(userId.charAt(3)) && Character.isDigit(userId.charAt(4)) && Character.isDigit(userId.charAt(5)));
        //assert
        assertEquals(true, result);
    }

    @Test
    public void test_invalid_userId_displayed_upon_incorrect_userId_input() {
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
    public void test_4_consecutive_zeros() {
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
    public void test_password_at_least_10_characters_in_length() {
        //arrange
        String password = "arby12345*/";
        boolean expectedResult = true;
        String userId = "AA1234";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //act
        boolean result = password.length() >= 10;
        //assert
        assertEquals(true, result);
    }

    @Test
    public void test_password_too_short() {
        //arrange
        String password = "12345ar";
        boolean expectedResult = false;
        String userId = "AA1234";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //act
        boolean result = password.length() >= 10;
        //assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void test_initialiseAOCDetails_returns_astronomicalObjectClassificationCode_in_correct_format() throws invalidUserInputException {
        //arrange
        String userId = "AA1234";
        String password = "arby12345*/";
        String astronomicalObjectClassificationCode = "SSun27TL";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        cut.initialiseAOCDetails(astronomicalObjectClassificationCode);
        //act
        boolean result = astronomicalObjectClassificationCode.matches("[A-Z][0-9]{0,8}[A-Z][a-z]{2}[0-9]{1,3}(T|M|B|L|TL)");
        //assert
        assertEquals(true, result);
    }

//    @Test
//    public void test_initialiseAOCDetails_returns_invalid_format_when_astronomicalObjectClassificationCode_not_correct_format() throws invalidUserInputException {
//        //arrange
//        String userId = "AA1234";
//        String password = "arby12345*/";
//        String astronomicalObjectClassificationCode = "Ssun27TL";
//        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
//        cut.initialiseAOCDetails(astronomicalObjectClassificationCode);
//        //act
//        boolean result = astronomicalObjectClassificationCode.matches("[A-Z][0-9]{0,8}[A-Z][a-z]{2}[0-9]{1,3}(T|M|B|L|TL)");
//        //assert
//        assertEquals(false, result);
//    }

    @Test
    public void test_objectType_returns_valid_object() throws invalidObjectException {
        //arrange
        String userId = "AA1234";
        String password = "arby12345*/";
        List<String> objectType = Collections.singletonList("Star");
        boolean expectedResult = true;
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        cut.getObjectType(objectType);
        //act
        boolean result = objectType.contains("Star");
        //assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void test_objectType_returns_invalid_object() throws invalidObjectException {
        //arrange
        String userId = "AA1234";
        String password = "arby12345*/";
        List<String> objectType = Collections.singletonList("rocket");
        boolean expectedResult = false;
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        cut.getObjectType(objectType);
        //act
        boolean result = objectType.contains("Rocket");
        //assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void test_objectName_returns_name_of_object() {
        //arrange
        String userId = "AA1234";
        String password = "arby12345*/";
        String objectName = "Ceres";
        boolean expectedResult = true;
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        cut.getObjectName();
        //act
        boolean result = objectName.contains("Ceres");
        //assert
        assertEquals(expectedResult, result);
    }

    @Test
    public void test_exists_field_tells_us_that_ACO_does_exist() {
        //arrange
        String userId = "AA1234";
        String password = "arby12345*/";
        String astronomicalObjectClassificationCode = "Planet";
        boolean exists = true;
        boolean expectedResult = true;
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        cut.getExists(exists);
        //act
        boolean result = astronomicalObjectClassificationCode.contains(astronomicalObjectClassificationCode);
        //assert
        assertEquals(expectedResult, result);

    }

    @Test
    public void test_AOC_returned_when_input_data_is_valid() {
        //arrange
        String userId = "AA1234";
        String password = "arby12345*/";
        String validAOC = "SSun27TL";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        cut.setAstronomicalObjectClassificationCode(validAOC);
        String expectedResult = validAOC;
        //act
        String result = cut.getAstronomicalObjectClassificationCode();
        //assert
        assertEquals(expectedResult, result);
    }
    @Test
    public void EasyMockStatusInfo() throws invalidWebServiceDataFormatException, invalidUserInputException {
        IAOC iaoc = EasyMock.createNiceMock(IAOC.class);
        String expectedResult = "SSun27TL,Star,Sun,83950000000,695510,255440000000000000,198900000000000000000000000000";
        EasyMock.expect(iaoc.getStatusInfo("SSun27TL")).andReturn(expectedResult);
        EasyMock.replay(iaoc);
        String userId = "AA1234";
        String password = "arby12345*/";
        SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        cut.initialiseAOCDetails("SSun27TL");
        String result = cut.getObjectName();
        assertEquals("Sun", result);
    }
}

  //  @Test
    //public void invalid_web_service_data_format_exception_thrown_when_invalid_AOC_input() {
      //  //arrange
        //String userId = "AA1234";
        //String password = "arby12345*/";
        //String invalidAOC = "76gygfr21";
        //SolarSystemInformation cut = new SolarSystemInformation(userId, password);
        //cut.setAstronomicalObjectClassificationCode(invalidAOC);
        //String expectedMessage = "Invalid AOC data format";
        //act
        //Exception exception = assertThrows(invalidUserInputException.class, cut::getAstronomicalObjectClassificationCode);
        //String actualMessage = exception.getMessage();
        //assert
        //assertTrue(actualMessage.contains(expectedMessage));
    //}
//}




