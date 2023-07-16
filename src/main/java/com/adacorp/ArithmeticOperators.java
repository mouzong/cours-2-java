package com.adacorp;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a  = 10;
        int b = 7;

        int somme = a + b;
        int difference = a - b;
        int produit = a * b;
        int quotien = a / b;
        int modulo = a % b;


        boolean estEgal = (a == b);
        boolean estSuperieur = (a > b);
        boolean estInferieur = (a < b);

        // Operateur d'incrementaion et de Decrementation

        // Post Incrementation/Decrementation
        a++; // a = a + 1;
        b--; // b = b - 1;

        a += 1; // a = a + 1
        a += 3; // a = a + 3

        b -= 1; // b = b - 1

        // Pre Incrementation / Decrementation
        System.out.println("a = "+ a +" et b = "+ b);

        System.out.println(++a);
        System.out.println(a++);

        System.out.println(--b);



        System.out.println("a = "+ a +" et b = "+ b);
        System.out.println("Somme : "+ somme);
        System.out.println("Difference : "+ difference);
        System.out.println("Produit : "+ produit);
        System.out.println("Quotien : "+ quotien);
        System.out.println("Modulo : "+ modulo);
        System.out.println("Est Egal : "+ estEgal);
        System.out.println("Est Superieur : "+ estSuperieur);
        System.out.println("Est Inferieur : "+ estInferieur);
    }
}
