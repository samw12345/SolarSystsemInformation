package com.qa.SolarSystemInformation;

import java.math.BigDecimal;

public class SolarSystemInformation {
    public String userId;
    public String password;
    public String astronomicalObjectClassificationCode;
    public Boolean exists;
    public int orbitalPeriod;
    public BigDecimal radius;
    public BigDecimal semiMajorAxis;
    public BigDecimal mass;


    public SolarSystemInformation(String userId, String password) {

        if (userId.matches("[A-Z]{2}[0-9](?!0000)")) {
            this.userId = userId;

        }
        else this.userId = "invalid userId";


        if (password.length() >= 10) {
            this.password = password;

        }
        else this.password = "invalid password length";

    }

    public String initialiseAOCDetails(String astronomicalObjectClassificationCode ){

        return astronomicalObjectClassificationCode;
    }
    public String toString(){

        return null;
    }

    public BigDecimal getMass() {
        return mass;
    }

    private void setMass(BigDecimal mass) {
        this.mass = mass;
    }

    public BigDecimal getRadius() {
        return radius;
    }

    private void setRadius(BigDecimal radius) {
        this.radius = radius;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    private void setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Boolean getExists() {
        return exists;
    }

    private void setExists(Boolean exists) {
        this.exists = exists;
    }

    public BigDecimal getSemiMajorAxis() {
        return semiMajorAxis;
    }

    private void setSemiMajorAxis(BigDecimal semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public String getAstronomicalObjectClassificationCode() {
        return astronomicalObjectClassificationCode;
    }

    public void setAstronomicalObjectClassificationCode(String astronomicalObjectClassificationCode) {
        this.astronomicalObjectClassificationCode = astronomicalObjectClassificationCode;
    }

    public void getUserId() {
    }

    public boolean getUserId(boolean b) {
        return b;
    }
    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setUserId(String userId) {
        this.userId = userId;
    }
}
