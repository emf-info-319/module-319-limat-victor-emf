/**
 * ExercicesInversionTableau
 */
public class ExercicesInversionTableau {
    final static int MIN = 0;
    final static int MAX = 100;

    public static void main(String[] args) {
        int[] tableauInitial = new int[4];
        for (int i = 0; i < tableauInitial.length; i++) {
            System.out.println("Contenu du tableau initial : " + (tableauInitial[i] = (int)(Math.random() * (MAX - MIN + 1)) + MIN));
        }
     
        int[] tableauFinal = inverseLeTableau(tableauInitial);
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Contenu du tableau final : " + tableauFinal[i]);
        }

       
    }

    public static int[] inverseLeTableau(int[] tab) {
        int [] tableauInverse = new int[tab.length]; //créer un nouveau tableau d'entiers avec la même taille que celle de tab 
        for (int i = 0; i < tab.length; i++) {
            tableauInverse[i] = tab[tab.length - 1 - i]; //tab.lenght - 1 : Donne l'index du dernier élément de tab, car les index commenct à 0. Donc, pour un tableau de longueur 4, le dernier élément est à l’index 3 (tab.length - 1 = 3).
                                                        // - i : permet d'aller du dernier éléments vers le premier au fur et à mesure que i augmente. Ainsi, on commence par i = 0 et on finit à i = 3, en remontant progressivement dans tab. 

        }
        return tableauInverse;
    




    }








}