package com.qa.SolarSystemInformation;

public interface IAOC {
        boolean authenticate(String userID, String password);
        String getStatusInfo ( String astronomicalObjectClassificationCode);
    }

