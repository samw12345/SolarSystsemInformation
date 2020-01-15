package com.qa.SolarSystemInformation;

import java.math.BigDecimal;
import java.util.List;

public class SolarSystemInformation {
    public String userId;
    public String password;
    public String astronomicalObjectClassificationCode;
    public Boolean exists;
    public int orbitalPeriod;
    public BigDecimal radius;
    public BigDecimal semiMajorAxis;
    public BigDecimal mass;
    public List<String> objectType;

    public List<String> getObjectType(List<String> objectType) {
        return this.objectType;
    }

    private List<String> setObjectType(List<String> objectType) {
        objectType.add("Star");
        objectType.add("Planet");
        objectType.add("Moon");
        objectType.add("Dwarf Planet");
        objectType.add("Asteroid");
        objectType.add("Comet");
        this.objectType = objectType;
        return objectType;
    }

    public SolarSystemInformation(String userId, String password) {

        if (userId.matches("[A-Z]{2}[0-9](?!0000)")) {
            this.userId = userId;

        } else this.userId = "invalid userId";


        if (password.length() >= 10) {
            this.password = password;

        } else this.password = "invalid password length";

    }

    public String initialiseAOCDetails(String astronomicalObjectClassificationCode) {
        if (astronomicalObjectClassificationCode.matches("[A-Z][0-9]{0,8}[A-Z][a-z]{2}[0-9]{1,3}(T|M|B|L|TL)")) {
            return astronomicalObjectClassificationCode;
        } else {
            return "invalid format";
        }

    }

    public String toString() {

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

    private String setAstronomicalObjectClassificationCode(String astronomicalObjectClassificationCode) {
        this.astronomicalObjectClassificationCode = astronomicalObjectClassificationCode;
        return astronomicalObjectClassificationCode;
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

    private String setUserId(String userId) {
        this.userId = userId;
        return userId;
    }
}
