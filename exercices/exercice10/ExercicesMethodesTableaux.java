/**
 * ExercicesMethodesTableaux
 */
public class ExercicesMethodesTableaux {

    //méthode main
    public static void main(String[] args) {
        int[] newTab = creerTab(3);
        int[] newTab2 = remplirTab(newTab, 6);
        int tailleNewTab = retournerTailleTab(newTab);
        int minTab = retournerMinTab(newTab);
        int maxTab = retournerMaxTab(newTab);
        int nbDefFoisValeur = retournerNbFoisValeurTab(newTab, 4);
        int sommeTotalValeursTab = retournerSommeValeursTab(newTab);
    }

    //méthode qui créer un tableau
    public static int[] creerTab(int taille) {
        int[] tab = new int[taille];
        return tab;
    }

    //méthode qui remplit un tableau avec des valeurs aléatoires
    public static int[] remplirTab(int[] tab, int valeur) {
    for (int i = 0; i < tab.length; i++) {
        tab[i] = valeur; }
        return tab;
    }

    //méthode qui retourne la taille du tableau
    public static int retournerTailleTab(int[] tab) {
        return tab.length;
    }

    //méthode qui affiche le contenu d'un tableau
    public static void afficherContenuTab(int[] tab, String[] args) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println( tab[i] ); 
        }
    }

    //méthode qui recherche la valeur minimum d'un tableau
    public static int retournerMinTab(int[] tab) {
        if (tab.length == 0) {
            return 0;
        }
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            min = Math.min(min, tab[i]);
        }
        return min;
    }

    //méthode qui recherche la valeur maximum d'un tableau
    public static int retournerMaxTab(int[] tab) {
        if (tab.length == 0) {
            return 0;
        }
        int max =  tab[0];
        for (int i = 1; i < tab.length; i++) {
            max = Math.max(max, tab[i]);
        }
        return max;
    }
    //méthode qui compte la fréquenced'une valeur dans un tableau
    public static int retournerNbFoisValeurTab(int[] tab, int valeur) {
        int nbFois = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeur) { nbFois++;
                
            }
        }
        return nbFois;
    }

    //méthode qui établit la somme des valeurs contenues dans un tableau
    public static int retournerSommeValeursTab(int[] tab) {
        int sommeValeurs = 0;
        for (int i = 0; i < tab.length; i++) {
            sommeValeurs += tab[i];
        }
        return sommeValeurs;
    }
    
}
