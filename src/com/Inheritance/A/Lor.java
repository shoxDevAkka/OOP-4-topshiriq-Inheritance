package com.Inheritance.A;

public class Lor extends Doctor {

    private long id;
    private String name;
    private static String speciality = "Lor";
    private long experience;
    private long patienceCount;
    private long bonus;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setSpeciality(String speciality) {
        Lor.speciality = speciality;
    }

    public void setExperience(long experience) {
        this.experience = experience;
    }

    public void setPatienceCount(long patienceCount) {
        this.patienceCount = patienceCount;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public void displayLor(){
        System.out.println("Lor shaxsiy ma'lumotlari :");
        System.out.println("id : " + id);
        System.out.println("Ismi : " + name);
        System.out.println("Ish tajribasi : " + experience);
        System.out.println("Mutaxasisligi : " + speciality);
        System.out.println("Oyligi : " + getSalary());
        System.out.println("Ustamasi : " + bonus);
        System.out.println("Bemorlari soni : " + patienceCount);
        System.out.println();
        System.out.println("Lor umumiy ma'lumotlari :");
        System.out.println("Ish joyi : " + getWorkPlace());
        System.out.println("Umumiy aloqa markazi :" + getContact());
        System.out.println("Ish-jadvali : " + getSchedule());
    }

}
