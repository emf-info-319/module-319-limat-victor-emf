import javax.swing.Spring;

public class LimatE00 {
    static int NOMBRE_PTS_VICTOIRE = 3;
    static int MAX = 10;
    static int MIN = 1;

    public static void main(String[] args) {
        String nomEquipe1 = "Barcelon";
        String nomEquipe2 = "Madrid";
        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;

        for (int i = 0; i < 10; i++) {
            int scoreEquipe1 = (int) (Math.random() * (MAX - MIN) + MIN);
            int scoreEquipe2 = (int) (Math.random() * (MAX - MIN) + MIN);
            System.out.println(
                    nomEquipe1 + " joue contre " + nomEquipe2 + " et le résultat est : " + scoreEquipe1 + " à "
                            + scoreEquipe2);
            if (scoreEquipe1 > scoreEquipe2) {
                nombrePointEquipe1 += NOMBRE_PTS_VICTOIRE;
                System.out.println(nomEquipe1 + " a gagné");
            }
            else if (scoreEquipe1 < scoreEquipe2) {
                nombrePointEquipe2 += NOMBRE_PTS_VICTOIRE;
                System.out.println(nomEquipe2 + " a gagné");
            }
            else  {
                System.out.println("Match nul");
                nombrePointEquipe2 += 1;
                nombrePointEquipe1 += 1;
            }

           
        }  System.out.println(nomEquipe1 + " a " + nombrePointEquipe1 + " points");
        System.out.println(nomEquipe2 + " a " + nombrePointEquipe2 + " points");

    }
}
