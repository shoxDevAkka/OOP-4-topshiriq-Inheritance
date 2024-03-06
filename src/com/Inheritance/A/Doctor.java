package com.Inheritance.A;

public class Doctor {
    private static String workPlace;
    private static long salary;
    private static String contact;
    private static String schedule;


    public static void setWorkPlace(String workPlace) {
        Doctor.workPlace = workPlace;
    }

    public static void setSalary(long salary) {
        Doctor.salary = salary;
    }

    public static void setContact(String contact) {
        Doctor.contact = contact;
    }

    public static void setSchedule(String schedule) {
        Doctor.schedule = schedule;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public long getSalary() {
        return salary;
    }

    public String getContact() {
        return contact;
    }

    public String getSchedule() {
        return schedule;
    }
}
