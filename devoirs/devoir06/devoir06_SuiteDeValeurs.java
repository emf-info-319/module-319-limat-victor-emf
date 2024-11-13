public class devoir06_SuiteDeValeurs {

    public static final int TAILLE_TABLEAU = 20;
    public static final int VALEUR_MIN = 0;
    public static final int VALEUR_MAX = 50;
    public static final int VALEUR_RECHERCHEE = 7;
    public static void main(String[] args) {

        int[] tab = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Tableau[" + i + "] = [" + tab[i] + "]");
        }

        System.out.println("La plus petite valeur trouvée est : " + rechercheMin(tab));
        System.out.println("La plus grande valeur trouvée est : " + rechercheMax(tab));
        System.out.println("Le nombre [" + VALEUR_RECHERCHEE + "] figure à la position [" + rechercheValeur(tab, VALEUR_RECHERCHEE) + "]");



    }

    public static int[] genereTableau (int VALEUR_MIN, int VALEUR_MAX, int TAILLE_TABLEAU) {
        
        int[] tab;
        tab = new int[TAILLE_TABLEAU];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int)(Math.random() * (VALEUR_MAX - VALEUR_MIN + 1)) + VALEUR_MIN;
        }
        return tab;
    }

    public static int rechercheMin (int[] tab) {

        int valeurMinimaleTab = tab[1];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < valeurMinimaleTab) {
                valeurMinimaleTab = tab[i];
                
            }
        }
        return valeurMinimaleTab;

    }

    public static int rechercheMax(int[] tab) {

        int valeurMaximaleTab = tab[1];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > valeurMaximaleTab) {
                valeurMaximaleTab = tab[i];
                
            }
        }
        return valeurMaximaleTab;

    }

    public static int rechercheValeur(int[] tab, int valeurAChercher) {
        
        int positionValeur = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurAChercher) {
                positionValeur = i;
                continue;
            }
        }
        return positionValeur;

    }
}