public class testString {
    public static void main(String[] args) {
        String texte = "J'aime le ragusa";
        String texte2 = "J'aime le Torrino";
        
        
        boolean vide = texte.isEmpty();
        String txtMaj = texte.toLowerCase();
        boolean estEgal = texte.equals(texte2);

        System.out.println(vide + "\n" + txtMaj + "\n" + estEgal);


        int[] tab = new int[5];

        for (int i = 0; i < tab.length; i++) {
            
            tab[i] = (int)(Math.random() * (10 - 2 + 1)) + 2;
            System.out.println(tab[i]);
        }

    }

}
