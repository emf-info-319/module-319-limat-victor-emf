package exercices.exercice09;

import javax.print.DocFlavor.STRING;

/**
 * ExerciceTableaux1
 */
public class ExerciceTableaux1 {

    public static void main(String[] args) {

        // création tableau de int
        int[] monTableau;
        monTableau = new int[] { 3, 4, 9, 10 };



        // Afficher une valeur du tableau
        int valeurCellule1 = monTableau[1];
        System.out.println(valeurCellule1);


        // Afficher toutes les cellules du tableau :
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }

        //-------------------------------------------------


        // création tableau de string
        String[] mon2Tableau;
        mon2Tableau = new String[] { "Laurent", "Michel", "Dominique" };

        // Afficher une valeur du tableau
        String valeurCelluleduTab2 = mon2Tableau[1];
        System.out.println(valeurCelluleduTab2);


        // Afficher toutes les cellules du tableau :
        for (int i = 0; i < mon2Tableau.length; i++) {
            System.out.println(mon2Tableau[i]);
        }

    }
}
