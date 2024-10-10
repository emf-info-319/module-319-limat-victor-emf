/**
 * Limat
 */
public class Limat {
    public static final int NOTE_MIN = 1;
    public static final int NOTE_MAX = 6;
    public static final int NBRE_NOTES = 5;

    public static void main(String[] args) {

        int[] notesObtenues = new int[NBRE_NOTES];

        for (int i = 0; i < notesObtenues.length; i++) {
            notesObtenues[i] = (int) (Math.random() * (NOTE_MAX - NOTE_MIN + 1)) + NOTE_MIN;
        }

        double totalNote = 0;
        for (int i = 0; i < notesObtenues.length; i++) {
            totalNote += notesObtenues[i];
            System.out.print("La note obtenue est " + notesObtenues[i] + " :");

            switch (notesObtenues[i]) {
                case 6:
                    System.out.println("Très bien");
                    break;
                case 5:
                    System.out.println("Bien");
                    break;
                case 4:
                    System.out.println("Suffisant");
                    break;
                default:
                    System.out.println("Insuffisant");
                    break;
            }

        }
        double moyenne = totalNote / NBRE_NOTES;
        System.out.println(moyenne);
        if (moyenne > 4) {
            System.out.println("L'élève est promu !");
        } else {
            System.out.println("L'élève est non promu !");
        }
    }

}
