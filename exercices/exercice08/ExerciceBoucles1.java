package exercices.exercice08;

public class ExerciceBoucles1 {
    public static void main(String[] args) {

        // Partie FOR
        for (int iteration = 1; iteration <= 5; iteration++) {
            System.out.println("Boucle for intération: " + iteration);
        }

        // Partie WHILE
        int iterationWhile = 1;
        boolean PLusPetitQue5 = true;

        while (PLusPetitQue5) {

            System.out.println("Boucle while: " + iterationWhile++);

            if (iterationWhile > 5) {
                PLusPetitQue5 = false;
            }
        }

        // Partie DO WHILE
        int iterationDoWhile = 1;
        PLusPetitQue5 = true;
        do {
            System.out.println("Boucle do-while: " + iterationDoWhile++);
            if (iterationDoWhile > 5) {
                PLusPetitQue5 = false;
            }
        } while (PLusPetitQue5 == true);

        // ForCONTINUE
        for (int iteration = 1; iteration <= 5; iteration++) {
            if (iteration == 3) {
                continue;
            } // la commande "continue" permet de sauter la valeur désirée.
            System.out.println("Boucle for intération: " + iteration);
        }

        // WhileBREACK
        int iterationWhileBR = 1;
        PLusPetitQue5 = true;

        while (PLusPetitQue5) {

            System.out.println("Boucle while: " + iterationWhileBR++);

            if (iterationWhileBR > 5) {
                PLusPetitQue5 = false;

            }
            if (iterationWhileBR == 4) {
                break;                      //la commande "breack" permet de stopper le programme lorsqu'il atteint la valeur désirée.
            }
        }
    }
}
