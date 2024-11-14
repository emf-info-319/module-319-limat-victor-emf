public class Livret {
    static public final int MIN = 5;
    static public final int MAX = 20;

    public static void main(String[] args) {
        int nombre1 = choisirUnNombre(MIN, MAX);
        int nombre2 = choisirUnNombre(MIN, MAX);
        System.out.println("Les chiffres sont : " + nombre1 + " et " + nombre2);

        String[] tableauTableMultiplication = construireTableMultiplication(nombre1, nombre2);
        for (int i = 0; i < tableauTableMultiplication.length; i++) {
            System.out.println(tableauTableMultiplication[i]);
        }
    }

    public static int choisirUnNombre(int min, int max) {
        int nombre = (int) (Math.random() * (max - min + 1)) + min;

        return nombre;
    }

    public static String[] construireTableMultiplication(int nb1, int nb2) {
        
        String[] tab = new String[nb1 * nb2];
        int nbDepart1 = 1;
        int nbDepart2 = 1;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = nbDepart1 + " x " + nbDepart2 + " = " + nbDepart1 * nbDepart2;
            nbDepart2++;
            if (nbDepart2 == nb2 + 1) {
                nbDepart2 = 1;
                nbDepart1++;
                
            }
        }
        return tab;
    }
}

