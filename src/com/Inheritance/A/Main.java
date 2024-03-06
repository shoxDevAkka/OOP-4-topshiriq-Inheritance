package com.Inheritance.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Doctor doctor = new Doctor();
        Xirurg xirurg = new Xirurg();
        Lor lor = new Lor();

        System.out.println("Doctor xususiyatlarini kiriting :");
        System.out.println("Ish joyini kiriting :");
        String workPlace = scanner.next();
        System.out.println("Bazaviy oylikni kiriting :");
        long salary = scanner.nextLong();
        System.out.println("Aloqa markazini kiriting :");
        String contact = scanner.next();
        System.out.println("Ish-jadvalni kiriting : (ish haftasiga nechi kun)");
        String schedule = scanner.next();

        doctor.setWorkPlace(workPlace);
        doctor.setSalary(salary);
        doctor.setContact(contact);
        doctor.setSchedule(schedule);

        System.out.println();
        System.out.println("Xirurg xususiyatlarini kiriting :");
        System.out.println("Xirurg id-sini kiriting :");
        long id = scanner.nextLong();
        System.out.println("Xirurg ismini kiriting :");
        String name = scanner.next();
        System.out.println("Xirurg ish-tajribasini kiriting : (yil)");
        long experience = scanner.nextLong();
        System.out.println("Xirurg qo'shimcha ustamasini kiriting : (bonus oyligi)");
        long bonus = scanner.nextLong();
        System.out.println("Xirurg bemorlari sonini kiriting :");
        long patienceCount = scanner.nextLong();

        xirurg.setId(id);
        xirurg.setName(name);
        xirurg.setExperience(experience);
        xirurg.setPatienceCount(patienceCount);
        xirurg.setBonus(bonus);

        System.out.println();
        xirurg.displayXirurg();


        System.out.println();
        System.out.println("Lor xususiyatlarini kiriting :");
        System.out.println("Lor id-sini kiriting :");
        long id1 = scanner.nextLong();
        System.out.println("Lor ismini kiriting :");
        String name1 = scanner.next();
        System.out.println("Lor ish-tajribasini kiriting : (yil)");
        long experience1 = scanner.nextLong();
        System.out.println("Lor qo'shimcha ustamasini kiriting : (bonus oyligi)");
        long bonus1 = scanner.nextLong();
        System.out.println("Lor bemorlari sonini kiriting :");
        long patienceCount1 = scanner.nextLong();

        lor.setId(id);
        lor.setName(name);
        lor.setExperience(experience);
        lor.setPatienceCount(patienceCount);
        lor.setBonus(bonus);

        System.out.println();
        lor.displayLor();

    }
}
