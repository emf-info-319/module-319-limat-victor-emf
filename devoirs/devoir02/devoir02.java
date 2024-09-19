package devoirs.devoir02;

import java.util.Random;

/**
 * devoir02
 */
public class devoir02 {
    int CAPACITE_RESERVOIR_A = 3;
    int CAPACITE_RESERVOIR_B = 5; // les deux constantes en dehors de main

    public static void main(String[] args) {
    

        int reservoirA = 0;
        int reservoirB = 0; // les deux variables
        int remplissage;

        int capaciteTotale = CAPACITE_RESERVOIR_A + CAPACITE_RESERVOIR_B;

        remplissage = (int)(Math.random() * (capaciteTotale + 1));

        System.out.println("Il y a " + remplissage + " litres à remplir.");

        //boucle pour remplir les réservoirs
        while (remplissage > 0) { //tant que c'est vrai, faire...
            // Remplir le réservoir A
            if (reservoirA < CAPACITE_RESERVOIR_A)
                reservoirA++; 
{           System.out.println("Remplissage du réservoir A...");

}            else { reservoirB++; 
                System.out.println("Remplissage du réservoirB..."); }
            remplissage--;
            System.out.println("Le réservoir A : " + reservoirA + ", le réservoir B :" + reservoirB);
            
        }
        System.out.println("Remplissage terminé !");
    }
}
