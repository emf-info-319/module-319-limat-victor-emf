/**
 * devoir03correction
 */
public class devoir03correction {
   
    
        public static void main(String[] args) {
            int jour = 24;
            int mois = 9;
            int annee = 2024;
            int jourdelAn = 0;
            int[] nbJourmois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
            if (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) {
                nbJourmois[1] = 29;
    
            }
    
            if (annee >= 0 && annee <= 9999 && mois >= 1 && mois <= 12 && jour >= 1
                    && jour <= nbJourmois[mois - 1])
    
            {
                switch (mois) {
                    case o:
                    jourdelAn = jour;
                        
                        break;
                case 1: 
                    jourdelAn = jour + 31;
                    
                        break;

                        case 2 : jourdelAn + 28


                
             
    
                }
                
                System.out.println("Le " + jour + "/" + mois + "/" + annee + " est le jour " + jourdelAn + " de l'An.");
            }
    
            else {
                System.out.println("Vous avez dépassé les limites pour la date");
            }
        }
    }
    

