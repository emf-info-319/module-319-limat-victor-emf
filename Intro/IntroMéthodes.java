package Intro;

import java.util.Scanner;

/**
 * MéthodeMain
 */
public class IntroMéthodes {

    public static void main(String[] args) {
        System.out.println("Bonjour et bienvenu sur ce premier programme.");
        System.out.println("On va voir les méthodes dans ce cours");

        début();

        // Voici comment lire un entier depuis la console
        int valeur = demandeNombre();

        // On continue à utiliser le scanner dans le programme…
        int valeur01 = demandeNombre();

        // On continue
        int valeur02 = demandeNombre();

        int total = somme(valeur, valeur01, valeur02);

        System.out.println("La somme est : " + total);
        fin();
    }

    public static void début() {
        System.out.println("Début du programme");

    }

    public static int demandeNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre :");
        int nombreDonné = scanner.nextInt();
        System.out.println("Merci, j'enregistre " + nombreDonné);
        return nombreDonné;
    }

    public static void fin() {
        System.out.println("Fin du programme");

    }

    public static int somme(int nombre, int nombre01, int nombre02) {
        int résultat = nombre + nombre01 + nombre02;
        return résultat;
    }
}