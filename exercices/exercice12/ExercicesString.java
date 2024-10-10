/**
 * Exercice12
 */
public class ExercicesString {

    public static void main(String[] args) {

        String maChaineDeCaractere = "Voici du contenu stocké dans un String.";
        
        //afficher le nb de caractère
        System.out.println("Nombre de caractère contenu dans la variable MaChaineDeCaractere : " + maChaineDeCaractere.length());

 //------------------------------------------------------------

        // Trouver l'index du mot "contenu"
        int startIndex = maChaineDeCaractere.indexOf("contenu");

        System.out.println("Le mot contenu commence à la position : " + startIndex); // Affiche "l'index de contenu"

        //-------------------------------------------------------------
        
        String lettrePosition10 = maChaineDeCaractere.substring(10, 11);
        System.out.println( "La position 17 contient la lettre : " + lettrePosition10
        );

        //--------------------------------------------------------------

        String monPrenom; 
        monPrenom = "Victor";
        for (int i = 0; i < monPrenom.length; i++) {
            System.out.println(i);
        }
    }
}