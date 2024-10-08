package devoirs.devoir04;

/**
 * devoir04
 */
public class devoir04 {

    public static void main(String[] args) {
        int year = 2024;
        int mouth = 10;
        int day = 8;
        String[] MoisFormatée;
        MoisFormatée = new String[] { "janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout",
                "octobre", "septembre", "novembre", "décembre" };

        int[] JourParMois;
        JourParMois = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (mouth == 2 && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            JourParMois[1] = 29;
        }

        if (year >= 1 && year <= 9999 && mouth >= 1 && mouth <= 12 && day <= JourParMois[mouth - 1] && day >= 1) {
            System.out.println("La date entrée est le " + day + "." + mouth + "." + year);
            System.out.println("La date formatée est le " + day + " " + MoisFormatée[mouth - 1] + " " + year);
        } else if (mouth < 1 || mouth > 12) {

            System.out.println("La date entrée est le " + day + "." + mouth + "." + year);
            System.out.println("Le mois [" + mouth + "] est hors limites");

        } else if (day < 1 || day > JourParMois[mouth - 1]) {

            System.out.println("La date entrée est le " + day + "." + mouth + "." + year);
            System.out.println("Le jour [" + day + "] est hors limites");

        } else if (year < 1 || year > 9999) {

            System.out.println("La date entrée est le " + day + "." + mouth + "." + year);
            System.out.println("L'année [" + year + "] est hors limites");

        }

    }
}
