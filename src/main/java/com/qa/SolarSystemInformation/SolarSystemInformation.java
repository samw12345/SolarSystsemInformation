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

    public SolarSystemInformation(String userId, String password){
        this.userId = userId;
        this.password = password;

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
}
