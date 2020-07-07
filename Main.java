package com.itacademy;

public class Main {
    public static void main(String[] args) {

        Telephone nokia = new Telephone();
        nokia.displeyInfo();
        nokia.photo();
        System.out.println();

        Telephone samsung = new Telephone("samsung", 'M', 5, 64);
        samsung.displeyInfo();
        System.out.println("Nucleus "+ samsung.getNucleus());
        System.out.println("Memory "+ samsung.getMemory());
        samsung.photo();
        System.out.println();

        Telephone lg = new Telephone("lg", 'W', true, 140.6f, 2019);
        lg.setNucleus(4);
        lg.setMemory(128);
        lg.displeyInfo();
        System.out.println("Nucleus " +lg.getNucleus());
        System.out.println("Memory " +lg.getMemory());
        lg.photo();






    }
}
