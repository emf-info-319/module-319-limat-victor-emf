package E2_JeuDeNim;

import java.util.Scanner;

/**
 * JeuDeNim_LIMAT_E2
 */
public class JeuDeNim_LIMAT_E2 {

    public static final int NOMBRE_BATONNETS = 21;
    public static final int MIN = 1;
    public static final int MAX = 3;

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }

        System.out.println("Bienvenue dans le jeu de Nim !");
        System.out.println("Règles : Vous et l'IA retirez tour à tour entre 1 et 3 bâtonnets.");
        System.out.println("Le joueur qui retire le dernier bâtonnet perd.");
        boolean tourJoueur = true;

        while (nbBatonnetRestants(batonnets) > 0) {
            afficherBatonnets(batonnets);
            tourJoueur = !tourJoueur;
        if (tourJoueur) {
            int nbEnleve = demanderNombre(scanner);
            batonnets = enleverBatonnets(batonnets, nbEnleve);

        } else {
            int nbEnleveIA = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("L'IA veut enlever " + nbEnleveIA + " bâtonnets");
            batonnets = enleverBatonnets(batonnets, nbEnleveIA);

        } }

        if (tourJoueur == true) {
            System.out.println("Vous avez retiré le dernier bâtonnet. L'IA gagne !");

        } else {
            System.out.println("L'IA a retiré le dernier bâtonnet. Vous gagnez !");
        } 
        scanner.close();

    }

    public static void afficherBatonnets(int[] batonnets) {
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                System.out.print("|");

            } else {
                System.out.print("-");
            }

        }
        System.out.println(" ");
    }

    public static int nbBatonnetRestants(int[] batonnets) {
        int nbBatonnetPrésents = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                nbBatonnetPrésents++;

            }
        }
        return nbBatonnetPrésents;
    }

    public static int[] enleverBatonnets(int[] batonnets, int nbEnleve) {
        int nbRestants = nbBatonnetRestants(batonnets);
        int nbEnleveMax = 0;
        if (nbEnleve > nbRestants) {
            nbEnleveMax = nbRestants;
        } else {
            nbEnleveMax = nbEnleve;
        }
        for (int i = batonnets.length - 1; i >= 0 && nbEnleveMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleveMax--;

            }

        }
        return batonnets;
    }

    public static int demanderNombre(Scanner scanner) {
        System.out.println("Veuilez entrer un nombre entre 1 et 3 : ");
        int nbBatonnetEnlever = scanner.nextInt();
        while (nbBatonnetEnlever < 1 || nbBatonnetEnlever > 3) {
            System.out.println("Nombre incorrecte");
            nbBatonnetEnlever = scanner.nextInt();
        }

        return nbBatonnetEnlever;
    }

}