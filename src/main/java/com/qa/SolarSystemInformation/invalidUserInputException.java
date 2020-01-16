package com.qa.SolarSystemInformation;

public class invalidUserInputException extends Exception {
    private String invalid_AOC_data_format;

    public invalidUserInputException(String invalid_AOC_data_format) {
        this.invalid_AOC_data_format = invalid_AOC_data_format;
    }
}
