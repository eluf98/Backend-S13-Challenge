package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        // Plan enum kullanımı
        Plan basicPlan = Plan.BASIC;
        Plan platinumPlan = Plan.PLATINUM;

        // Healthplan objesi oluşturma
        Healthplan healthplan = new Healthplan(1, "Alice Healthplan", basicPlan);
        System.out.println(healthplan);  // toString() çağrılıyor

        // Employee objesi oluşturma
        String[] healthplans = new String[5];  // 5 elemanlı bir array
        Employee employee = new Employee(1, "Alice Johnson", "alice@example.com", "password123", healthplans);
        employee.addHealthPlan(0, "Basic Health Plan");
        System.out.println(employee);  // toString() çağrılıyor

        // Company objesi oluşturma
        String[] developers = new String[3];
        Company company = new Company(1, "TechCorp", 1000000.0, developers);
        company.addEmployee(0, "Alice");
        company.addEmployee(1, "Bob");
        System.out.println(company);  // toString() çağrılıyor




    }


}