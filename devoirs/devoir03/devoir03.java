package devoirs.devoir03;

public class devoir03 {

    public static void main(String[] args) {
        int jour = 24;
        int mois = 02;
        int annee = 2024;
        int jourdelAn = 0;
        int[] nbJourmois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) {
            nbJourmois[1] = 29;

        }

        if (annee >= 0 && annee <= 9999 && mois >= 1 && mois <= 12 && jour >= 1
                && jour <= nbJourmois[mois - 1])

        {
            for (int i = 0; i < mois - 1; i++) {
                jourdelAn += nbJourmois[i];  // += ça fait ---> jourdeLan = jourdeLan + nbJourmois[1] 

            }
            jourdelAn += jour;
            System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + jourdelAn + " de l'An.");
        }

        else {
            System.out.println("Vous avez dépassé les limites pour la date");
        }
    }
}
