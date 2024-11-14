public class JeuDuPendu {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String [] tabMotsADeviner = {"programmation", "java", "ordinateur", "développement", 
        "algorithmique", "informatique","module", "ingénieur", "graphique",
         "html", "réseau", "vscode", "boucles", "instructions", "conditions", "diagramme"};
        
        String motSecret = tabMotsADeviner[(int) (Math.random() * tabMotsADeviner.length)];
    

        scanner.close();
        
    }
}
