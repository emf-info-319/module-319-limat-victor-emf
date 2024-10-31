/**
 * ExercicesMethodesTableaux
 */
public class ExercicesMethodesTableaux {

    public static void main(String[] args) {
        int[] newTab = creerTab(3);
        int[] newTab2 = remplirTab(newTab, 5);
    }

    //méthode qui créer un tableau
    public static int[] creerTab(int taille) {
        int[] newTableau = new int[taille];
        return newTableau;
    }

    //méthode qui remplit un tableau
    public static int[] remplirTab(int[] newTab, int valeur) {
    for (int i = 0; i < newTab.length; i++) {
        newTab[i] = valeur;
    }
    return newTab;    
    }

}