public class Phaseur {
    
    
public static void main(String[] args) {
    
    nbreAleatoire(0, 10);
    String [] sujets = new String[]{"Nolhan", "Victor", "Hugo", "Nilo", "Jacky"};
    String [] verbes = new String[]{"est"};
    String [] choses = new String[]{"débile", "intélligent", "surpuissant", "insupportable", "un abruti", "genant"};


    for (int i = 0; i < 10; i++) {
        System.out.println(choisirMot(sujets) + " " + choisirMot(verbes) + " " + choisirMot(choses));
    }

}
    public final static int nbreAleatoire(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
     }

    public final static String choisirMot(String[] mots) {
        int min = 0;
        int max = mots.length - 1;
        return mots[nbreAleatoire(min, max)];
    }

}
