package com.qa.SolarSystemInformation;

public class WebServiceStub {
    private boolean isAuthenticated;
    public boolean authenticate(String userID, String password) {
        isAuthenticated = true;
        return isAuthenticated;
    }

    public String getStatus(String astronomicalObjectClassificationCode) {
        return astronomicalObjectClassificationCode;
    }
}
