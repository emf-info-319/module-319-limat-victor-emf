public class ExerciceTableaux2 {

    // déclaration des constantes pour les valeurs minimales et maximales
    static final int MAX = 6;
    static final int MIN = 1;

    public static void main(String[] args) {

        // création d'un tableau de 9 entiers ---> taille = 10 cellules (0 à 9)
        int[] monTableau = new int[10];

        // remplir le tableau avec des valeurs aléatoires entre MIN et MAX
        for // boucle qui répète les instructions
        (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = (int) (Math.random() * (MAX - MIN + 1))

                    + MIN;

        }
        //pour afficher toutes les valeurs du tableau (les aléatoires, monTableau [i]) 
        //et la cellule correspondante (i)
        for (int i = 0; i < monTableau.length; i++) {
            
            System.out.println("Cellule " + i + ":" + monTableau[i]);
        }

    }

}
