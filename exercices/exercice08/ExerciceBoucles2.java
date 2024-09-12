public class ExerciceBoucles2 {
    public static void main(String[] args) {
        // partie 1
        System.out.println("Boucle for :");
        for (int nombre = 5; nombre > 0; nombre--) {
            System.out.println(nombre);
        }
        // partie 2
        System.out.println("Boucle while:");
        int nombre2 = 5;
        boolean plusgrandque0 = true;

        while (plusgrandque0) {
            System.out.println(nombre2--);
            if (nombre2 <= 0) {
                plusgrandque0 = false;
            }

        }
        // partie 3
        System.out.println("Boucle do-while:");
        int nombre3 = 5;
        plusgrandque0 = true;
        do {
            System.out.println(nombre3);
            nombre3--;
            if (nombre3 <= 1){
                plusgrandque0 = false; }
        } // Fait le nombre, fait le -1 puis si le nombre est n'est pas égal ou plus petit que 1, arrête.
        while (plusgrandque0 == true);
         // Effectue le tant que c'est vrai.
    }

}
