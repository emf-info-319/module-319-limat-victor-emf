package devoirs.devoir02;

import java.util.Random;

/**
 * devoir02
 */
public class devoir02 {

    public static void main(String[] args) {
        final int CAPACITE_RESERVOIR_A = 3;
        final int CAPACITE_RESERVOIR_B = 5; // les deux constantes

        int reservoirA = 0;
        int reservoirB = 0; // les deux variables

        int remplissage;

        int capaciteTotale = CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B;

        Random random = new Random();
        remplissage = random.nextInt(capaciteTotale + 1);

        System.out.println("Il y a " + remplissage + " litres à remplir.");

        //boucle pour remplir les réservoirs
        while (remplissage > 0) { //tant que c'est vrai, faire...
            // Remplir le réservoir A
            if (reservoirA < CAPACITE_RESERVOIR_A)
                reservoirA++; remplissage--;
{           
            int ajoutA;    //3 plus petit ou egal à      3 - 2 = 1
            if (remplissage <= CAPACITE_RESERVOIR_A - reservoirA)
            ajoutA = remplissage;
            System.out.println("Remplissage du réservoir A...");
            ajoutA = remplissage;
} else { ajoutA = CAPACITE_RESERVOIR_A - reservoirA; }

            System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B :" + reservoirB);
            if (reservoirA == CAPACITE_RESERVOIR_A) {
                break;
            }
        }
        while (remplissage > 0) {
            if (reservoirB < CAPACITE_RESERVOIR_B || remplissage == 0)
                System.out.println(
                        "Remplissage du réservoir B...");
            System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B :" + reservoirB);
            if (reservoirB == CAPACITE_RESERVOIR_B || remplissage == 0) {
                break;
            }

        }
        System.out.println("Remplissage terminé !");
    }
}
