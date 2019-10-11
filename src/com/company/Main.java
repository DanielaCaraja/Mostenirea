package com.company;

public class Main {

    public static void main(String[] args) {
        Tata Mihail = new Tata ("Bostan", "Caprui", 1.86, "Saten");
        System.out.print("\n\n");
        System.out.print("class Tata --> Mihail");
        System.out.print("\n");
        System.out.println(Mihail.getNumeleDeFamilie());
        System.out.println(Mihail.getCuloareaOchilor());
        System.out.println(Mihail.getInaltimea());
        System.out.println(Mihail.getCuloareaParului());
        Fiu Ion = new Fiu( "Bostan", "Caprui", 1.90, "Saten", "Alba",90);
        System.out.print("class Tata --> class Mihail --> Ion");
        System.out.print("\n\n");
        System.out.println(Ion.getNumeleDeFamilie());
        System.out.println(Ion.getCuloareaOchilor());
        System.out.println(Ion.getInaltimea());
        System.out.println(Ion.getCuloareaParului());
        System.out.println(Ion.getCuloareaPielii());
        System.out.println(Ion.getGreutatea());
    }
}