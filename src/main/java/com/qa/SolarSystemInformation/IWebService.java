package com.qa.SolarSystemInformation;

    public interface IWebService {
        boolean authenticate(String userID, String password);
        String getStatusInfo(String astronomicalObjectClassification);
    }

