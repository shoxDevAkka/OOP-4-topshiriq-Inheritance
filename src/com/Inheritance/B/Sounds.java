package com.Inheritance.B;

public class Sounds extends Electronics{

    private double frequency = 5.6;
    private double voltage = 4.5;
    private String driver = "Intel Audio";

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
}
