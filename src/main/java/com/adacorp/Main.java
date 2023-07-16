package com.adacorp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println(args[0]);
        System.out.println("Compilation a la main d'un fichier .java");

        /**
         * Variables :
         * 1 - Primitive
         *      a - boolean : true, false
         *      b - char    : 'A', '9', '&' etc..
         *      c - int     : 10, -20, 15 etc
         *      d - float    : 17.45, 0.25 etc
         *      e - double  : 1000000000000000000099999.99999999999222232323
         *      f - byte(nombre entier de petite taille), short(nombre entier court), long (entier de grande taille)
         *
         * 2 - Reference / Objets
         *      - String,
         *      - Arrays,
         *      - Classes
         */


        /// Variables Primitives
        /** Declaration d'une variable
         *  typeDeLaVariable nomDeLaVariable = valeur;
         *
         */
        int numero1;
        numero1 = 20;
        int numero2 = 34;
        int resultat = numero1 + numero2;
        System.out.println(resultat);

        final double PI = 3.14;

        boolean estAdult = true;
        int age = 14;

        if(age >= 18){
            estAdult = true;
            System.out.println("le monsieur de "+ age +" ans est adulte ");
        } else {
            estAdult = false;
            System.out.println("le monsieur de "+ age +" ans n'est pas adulte ");
        }

        /// Variables Reference
        /** Declaration d'une variable
         *  typeDeLaVariable nomDeLaVariable = new typeDeLaVariable();
         *
         */


        List<String> listeDePresence = new ArrayList<>();
        listeDePresence.add("Merlin");
        listeDePresence.add("Nicaise");
        listeDePresence.add("Florian");
        listeDePresence.add("Manu");

        for(String element : listeDePresence){
            System.out.println(element);
        }

        String nouvellChaineDeCaractere = "Test sur chaine de carcteres";

        String chaine2 = new String("Test chaine deux");


        class Test2 {
            int num1;
            int num2;
            int result;

        }

        Test2 exampleDeTypeTest2 = new Test2();
        Test2 example_de_type_test2 = new Test2();






    }
}