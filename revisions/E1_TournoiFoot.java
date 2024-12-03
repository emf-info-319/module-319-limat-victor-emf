public class E1_TournoiFoot {
    public static final String[] EQUIPES = new String[] { "FC Central", "FC Richemont", "FC Schoenberg",
            "FC Beauregard", "Team AFF", "Etoile Sport" };
    public static final int MAX_GOAL = 10;
    public static int[] pointsEquipes = new int[EQUIPES.length];

    public static void main(String[] args) {

        for (int i = 0; i < EQUIPES.length; i++) {
            simuleMatch(i, i + 1);
        }
        
        simuleMatch(EQUIPES.length - 1, 0);
        

        System.out.println("-----------------------------");
        for (int j = 0; j < EQUIPES.length; j++) {
            System.out.println("L'équipe " + EQUIPES[j] + " a " + pointsEquipes[j] + " points");

        }
        System.out.println("-----------------------------");
        int[] gagnants = trouveGagnants();
        for (int k = 0; k < gagnants.length; k++) {
            int indexGagnant = gagnants[k];
            System.out.println("L'équipe " + indexGagnant + "a gagné");
        }
    }

    public static void simuleMatch(int index1, int index2) {
        int scoreEquipe1 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        int scoreEquipe2 = (int) (Math.random() * (MAX_GOAL - 0 + 1)) + 0;
        if (scoreEquipe1 > scoreEquipe2) {
            pointsEquipes[index1] += 3;
            System.out.println("L'équipe " + EQUIPES[index1] + " a gagné contre l'équipe " + EQUIPES[index2]);
        }
        if (scoreEquipe2 > scoreEquipe1) {
            pointsEquipes[index2] += 3;
            System.out.println("L'équipe " + EQUIPES[index2] + " a gagné contre l'équipe " + EQUIPES[index1]);
        }
    }

    public static int rechercheMAxPts() {
        int ptsMax = pointsEquipes[0];
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i] > ptsMax) {
                ptsMax = pointsEquipes[i];

            }
        }
        return ptsMax;
    }

    public static int[] trouveGagnants() {
        int maxPts = rechercheMAxPts();
        int compteurDesGagnants = 0;
        for (int i = 0; i < pointsEquipes.length; i++) {
            if (pointsEquipes[i] == maxPts) {
                compteurDesGagnants++;
            }
        }
        int[] equipeGagnante = new int[compteurDesGagnants];
        for (int j = 0; j < pointsEquipes.length; j++) {
            if (pointsEquipes[j] == maxPts) {
                equipeGagnante[j++] = j;
            }
        }
        return equipeGagnante;
    }

}
