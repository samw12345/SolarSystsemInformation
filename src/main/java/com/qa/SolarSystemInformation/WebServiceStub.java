package com.qa.SolarSystemInformation;

public class WebServiceStub {


        public boolean authenticate (String userID, String password) {
            return true;

        }

        public String getStatusInfo (String astronomicalObjectClassificationCode) {
            return "SSun27TL,Star,Sun,83950000000,695510,255440000000000000,198900000000000000000000000000";
        }


    public String getStatus(String astronomicalObjectClassificationCode) {
        return astronomicalObjectClassificationCode;
    }
}
