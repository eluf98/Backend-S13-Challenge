package org.example;

import javax.sound.midi.Soundbank;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    // Constructor
    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if (giro <0){
            System.out.println("Hata: Girilen değer 0'dan küçük olmaz.");
            this.giro=0;
        }else {
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    // addEmployee metodu
    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            // Geçersiz index kontrolü
            System.out.println("Geçersiz index değeri.");
        } else if (developerNames[index] == null) {
            // Boş bir index'e name ekle
            developerNames[index] = name;
            System.out.println("Çalışan eklenmiştir: " + name);
        } else {
            // Eğer index doluysa
            System.out.println("Bu index zaten dolu: " + index);
        }
    }

    // toString metodu
    @Override
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developers=["+ developerNames +  "}";
    }
}
