import java.util.Scanner;

/**
 * devoir05
 */

/*
 * 1. Tout d'abord, il faut que java génère un nombre aléatoire entre 1 et 100
 * (donc déclarer variable max et mnin + math random).
 * 2. Ensuit, il faut que l'utilisateur puisse écrire son choix dans la console.
 * 3. Puis, Java doit déterminer si le nombre inscris est plus petit ou plus
 * grand
 * que le nombre qu'il a généré. Si le nombre est plus grand, afficher :
 * "Trop grand".
 * Si le nombre est trop petit, afficher "trop petit". Si le nombre est égal,
 * afficher
 * "Bravo, tu as trouvé"
 -----------------
 Boucle :
 Nous devons faire une boucle "do while" pour nous permettre de répéter l'action.
 Nous devons déclarer le scanner en dehors de la boucle pour qu'il se lance et 
 et aussi fermer le scanner en DEHORS de la boucle autrement il va se fermer à chaque fois. 
 J' ai fait une boucle do while pour permettre de FAIRE le scanner, demander la valeur et donner 
 l'indice TANT que la valeur n'est pas égal au nombre. 
 * Les if doivent se trouver dans une boucle
 */

public class devoir05 {

    public static void main(String[] args) {

        int MAX = 100;
        int MIN = 1;
        int nbre = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        int valeur = 0;
        // On crée un scanner pour lire sur la ligne de commande les touches pressées
        Scanner scanner = new Scanner(System.in);
        do {
            // Voici comment lire un entier depuis la console
            System.out.print("Entrez une valeur svp : ");
            valeur = scanner.nextInt();
            scanner.nextLine(); // pour ignorer la touche RETURN
            // On continue à utiliser le scanner dans le programme…

            if (valeur > nbre) {
                System.out.println("Trop grand");

            }
            if (valeur < nbre) {
                System.out.println("Trop petit");

            }
            if (valeur == nbre) {
                System.out.println("Bravo, tu as trouvé !");

            }
        } while (valeur != nbre);
        // On referme le scanner à la fin du programme
        scanner.close();
    }
}