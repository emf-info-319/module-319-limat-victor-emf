public class ExerciceTableaux2 {

    // déclaration des constantes pour les valeurs minimales et maximales
    static final int MAX = 6;
    static final int MIN = 1;

    public static void main(String[] args) {

        // création d'un tableau de 9 entiers ---> taille = 10 cellules
        int[] monTableau = new int[9];

        // remplir le tableau avec des valeurs aléatoires entre MIN et MAX
        for // boucle qui répète les instructions
        (int i = 0; // fixe une variable i à 0.
                i < monTableau.length; // Tant que i est inférieur à la longueur du tableau (ici 9), continuer la
                                       // boucle
                i++ // augmente la valeur i de 1 à chaque boucle
                ) {
            monTableau[i] //
                    = (int) // défini math random comme un nb. entier
                    (Math.random() * (MAX - MIN + 1)) // math Random génère un nombre aléatoire entre o et 1 ; ici, il
                                                      // génère un nombre entre o (car ()) et entre 6 (MAX - MIN + 1)
                            + MIN;

        }
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println("Cellule "+ i + ":" + monTableau[1]);
        }

    }

}
