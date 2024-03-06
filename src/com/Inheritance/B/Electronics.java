package com.Inheritance.B;

public class Electronics {

    private double averageVoltage = 4.5;
    private String wiresType = "C-type";
    private double resistance = 12;

    public double getAverageVoltage() {
        return averageVoltage;
    }

    public void setAverageVoltage(double averageVoltage) {
        this.averageVoltage = averageVoltage;
    }

    public String getWiresType() {
        return wiresType;
    }

    public void setWiresType(String wiresType) {
        this.wiresType = wiresType;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
