public class ExerciceTableaux4 {
    static int MAX = 9999;
    static int MIN = 1;

    public static void main(String[] args) {

        // création d'un tableau de 5 entiers ---> taille = 5 cellules (0 à 4)
        int[] monTableau = new int[5];

        // créer le nb de départ avec une valeur aléatoire entre MIN et MAX

        monTableau[0] = (int) (Math.random() * (MAX - MIN)) - MIN;

        // créer une boucle qui va additonner 1 à la valeur de départ à chaque
        // itinérance et les afficher
        // et la cellule correspondante (i)
        for (int i = 0; i < monTableau.length; i++) { // Si i n'est pas la première cellule, on lui asigne la valeur de
                                                      // la cellule de précédente + 1
            if (i > 0) {
                monTableau[i] = monTableau[i - 1] + 1;
            } // i - 1 car si l'on met 0 ça va toujours faire le mm nb ex. : 3 + 1 alors qu'on
              // voudrait 4 + 1
            System.out.println("Cellule " + (i + 1) + ":" + monTableau[i]);
        }

    }

}
