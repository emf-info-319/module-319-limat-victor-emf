package Evaluation;

import java.util.Scanner;

/**
 * E1LimatVictor
 */
public class E1_ShutTheBox_LimatVictor {
    public static final int DES_MIN = 1;
    public static final int DES_MAX = 6;
    public static final int NOMBRE_TUILES = 12;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tuiles = new int[NOMBRE_TUILES];
        boolean enJeu = true;
        System.out.println("**********************************");
        System.out.println("*         'Shut The Box'         *");
        System.out.println("**********************************");
        System.out.println(
                "Il faut baisser les tuiles pour avoir un total équivalent au total de la sommes des dès. Le 0 permet de terminer la partie.");
        for (int i = 0; i < tuiles.length; i++) {
            tuiles[i] = tuiles[--i] + 1;
        }
        while (enJeu != false) {
            afficheTuile(tuiles);
            int totalDes = tireLesDes();
            System.out.println("Donnez le(s) nombre(s) à enlever :");
            tuiles = enleveTuiles(tuiles, totalDes);
            boolean encore = contientEncoreDesTuilesABaisser(tuiles);
            if (encore == false) {
                System.out.println("Jeu terminé");
                SCANNER.close();
                enJeu = false;
            }
        }
    }

    public static void afficheTuile(int[] tab) {

        for (int i = 0; i < tab.length; i++) {

            if (tab[i] >= 1 && tab[i] <= 9) {
                System.out.print("|0" + tab[i] + "|");
                
            }
            else if (tab[i] == 0) {
                System.out.print("|_|");
                
            }
            else {
                System.out.print("|" + tab[i] + "|");

        }
    }
}

    public static boolean contientEncoreDesTuilesABaisser(int[] tab) {
        boolean encoreTuilesABaisser = false;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) {
                encoreTuilesABaisser = true;
            }
        }
        return encoreTuilesABaisser;
    }

    public static int[] copieTableau(int[] tab) {
        int[] copie = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            copie[i] = tab[i];
        }
        return copie;
    }

    public static int tireLesDes() {
        int tireDes1 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int tireDes2 = (int) (Math.random() * (DES_MAX - DES_MIN + 1)) + DES_MIN;
        int totalTireDes = tireDes1 + tireDes2;
        System.out.println("Les nombres tirés sont : " + tireDes1 + " et " + tireDes2 + " qui font un total de 8");
        return totalTireDes;
    }

    public static int[] enleveTuiles(int[] tuiles, int t) {
        int[] tuilesTemp = copieTableau(tuiles);
        int totalEnleve = 0;
        boolean demandeEncore = true;
        do {
            int valeur = SCANNER.nextInt();
            totalEnleve += valeur;
            if (valeur == 0) {
                System.out.println("Abandon");
                for (int i = 0; i < tuilesTemp.length; i++) {
                    tuilesTemp[i] = 0;
                }
                tuiles = copieTableau(tuilesTemp);
                demandeEncore = false;
            } else if (valeur < 1 || valeur > tuilesTemp.length) {
                System.out.println("Hors limites !");
                totalEnleve = 0;

            } else if (tuilesTemp[valeur - 1] == 0) {
                System.out.println("Vous avez déjà baissé la tuille à la position " + valeur);
                totalEnleve -= valeur;

            } else {
                if (totalEnleve < t) {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("Ce n'est pas suffisant, merci d'enlever encore");
                } else if (totalEnleve > t) {
                    System.out.println("Le total est dépassez, choisissez d'autres nombres");
                    tuilesTemp = copieTableau(tuiles);
                    totalEnleve = 0;
                    afficheTuile(tuiles);
                } else {
                    tuilesTemp[valeur - 1] = 0;
                    System.out.println("Parfait !");
                    tuiles = copieTableau(tuilesTemp);
                    demandeEncore = false;
                }

            }
        } while (demandeEncore == true);
        return tuiles;
    }

}
