package com.itacademy;

public class Telephone {
    public String brand;
    public char sex;
    public boolean camera;
    public float lenght;
    public int year;
    private int nucleus;
    private int memory;

    public void photo() {
        System.out.println("I am beautiful!");
    }
    public void displeyInfo() {
        System.out.println("Brand " + brand);
        System.out.println("Sex " + sex);
        System.out.println("Camera " + camera);
        System.out.println("Lenght " + lenght);
        System.out.println("Year " + year);
    }
    public Telephone() {
        brand = "Nokia";
        sex = 'w';
        camera = true;
        lenght = 157.8f;
        year = 2018;
    }
    public Telephone(String brand, char sex, int nucleus, int memory) {
        this.brand = brand;
        this.sex = sex;
        camera = true;
        lenght = 160.5f;
        year = 2019;
        this.nucleus = nucleus;
        this.memory = memory;
    }
    public Telephone(String brand, char sex, boolean camera, float lenght, int year) {
        this.brand = brand;
        this.sex = sex;
        this.camera = camera;
        this.lenght = lenght;
        this.year = year;
        this.nucleus = nucleus;
    }
    public int getNucleus() {
        return nucleus;
    }
    public void setNucleus(int nucleus) {
        this.nucleus = nucleus;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
}

