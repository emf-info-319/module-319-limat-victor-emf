import java.util.Arrays;
import java.util.Random;

/**
 * ExercicesMethodesTableaux
 */
public class ExercicesMethodesTableaux {

    //méthode main
    public static void main(String[] args) {
        System.out.println("Le tableau a une taille de 50 cellules.");
        int[] newTab = creerTab(50);
        int[] newTab2 = remplirTab(newTab, 6);
        System.out.println("Contenu du Tableau aléatoire : " + Arrays.toString(newTab2));
        int tailleNewTab = retournerTailleTab(newTab);
        int minTab = retournerMinTab(newTab);
        System.out.println("La valeur min trouvée = " + minTab);
        int maxTab = retournerMaxTab(newTab);
        System.out.println("La valeur max trouvée = " + maxTab);
        int nbDefFoisValeur = retournerNbFoisValeurTab(newTab, 4);
        int sommeTotalValeursTab = retournerSommeValeursTab(newTab);
        int moyenneValeursTab = retournerMoyenneValeursTab(newTab);
        int valeurAChercherTabRemplacer = 3;
        int valeurDeRemplacement = 9;
        int[] valeursTabRemplacées = retournerTabValeursRemplacées(newTab,valeurAChercherTabRemplacer,valeurDeRemplacement);
        System.out.println("Après remplacement de la valeur " + valeurAChercherTabRemplacer + " par la valeur " + valeurDeRemplacement + " voici le contenu du tableau : " + Arrays.toString(valeursTabRemplacées));
        int valeurAChercherPosition = 3;
        int positionValeurRecherchéeTab = retournerPositionCelluleDeLaValeur(newTab, valeurAChercherPosition);
        int valeurAChercherDernièrePosition = 3;
        int dernièrePositionValeurRecherchée = retournerPositionCelluleDernièreFois(newTab, valeurAChercherDernièrePosition);
        System.out.println("La somme des cellules du tableau = " + sommeTotalValeursTab);
        System.out.println("La moyenne des cellules du tableau = " + moyenneValeursTab);
        System.out.println("La valeur " + valeurAChercherPosition + " a été trouvée à la 1ère position N°" + positionValeurRecherchéeTab);
        System.out.println("La valeur " +  valeurAChercherDernièrePosition + " a été trouvée à la dernière position N°" + dernièrePositionValeurRecherchée);

    }   

    //méthode qui créer un tableau
    public static int[] creerTab(int taille) {
        int[] tab = new int[taille];
        return tab;
    }

    //méthode qui remplit un tableau avec des valeurs aléatoires
    public static int[] remplirTab(int[] tab, int maxValeur) {
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
        tab[i] = random.nextInt(maxValeur + 1); 
    }
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

     //méthode qui établit la moyenne des valeurs contenues dans un tableau
     public static int retournerMoyenneValeursTab(int[] tab) {
        int totalValeurs = 0;
        for (int i = 0; i < tab.length; i++) {
            totalValeurs += tab[i];
        }
        int moyenneValeurs = totalValeurs / tab.length; 
        return moyenneValeurs;
     }

     //méthode qui remplace une valeur par une autre dans un tableau
     public static int[] retournerTabValeursRemplacées(int[] tab, int valeurAChercher, int valeurDeRemplacement) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurAChercher) { tab[i] = valeurDeRemplacement;
                
            }
        }
        return tab;
     }

     //méthode qui recherche la première occurence d'une valeur dans un tableau
     public static int retournerPositionCelluleDeLaValeur(int[] tab, int valeurAChercher) {
        int positionCelluleRecherchée = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == valeurAChercher) { 
                positionCelluleRecherchée = i;
                break;
            }
        }
        return positionCelluleRecherchée;
     }

     //méthode qui recherche la dernière occurrence d'une valeur dans un tableau
     public static int retournerPositionCelluleDernièreFois(int[] tab, int valeurAChercher) {
        int positionDernièreCelluleRecherchée = -1;
        for (int i = tab.length - 1; i >= 0; i--) {
            if (tab[i] == valeurAChercher ) {
                positionDernièreCelluleRecherchée = i;
                break;
                
            }
        }
        return positionDernièreCelluleRecherchée;
     }
}
