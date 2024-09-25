public class ExerciceTableaux3 {

    // déclaration des constantes pour les valeurs minimales et maximales
    static final int MAX = 6;
    static final int MIN = 1;

    public static void main(String[] args) {

        // création d'un tableau de 9 entiers ---> taille = 9 cellules (0 à 8)
        int[] monTableau = new int[10];

        // remplir le tableau avec des valeurs aléatoires entre MIN et MAX
        for // boucle qui répète les instructions
        (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = (int) (Math.random() * (MAX - MIN + 1))

                    + MIN;

        }

        // afficher la moyenne des notes (ici les nombres aléatoires)
        // pour cela il faut faire la somme des notes divisés par le nombre d'entre
        // elles (ici 9)
        int sommeTotal = 0; // déclaré la variable
        for (int i = 0; i < monTableau.length; i++) {

            // calculer la somme
            sommeTotal = sommeTotal + monTableau[i];
            
                System.out.println("Note numéro " + i + " -> " + monTableau[i]);
            }
            // calculer la moyenne de la somme et déclarer la variable moyenne
            // utiliser ""float" ou ""double" comme type de base (pr les nb à virgule)
            float moyenne = (float) sommeTotal / monTableau.length; //monTableau.lenght = 10


            {
                System.out.println("La moyenne des 10 élèves est " + moyenne);
            }
        }
    }

