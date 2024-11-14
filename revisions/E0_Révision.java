public class E0_Révision {

    public final static int NOTE_MIN = 1;
    public final static int NOTE_MAX = 6;
    public final static int NBRE_NOTES = 5;

    public static void main(String[] args) {
        
        int[] notesObtenues = new int[NBRE_NOTES];
        for (int i = 0; i < notesObtenues.length; i++) {
            notesObtenues[i] = (int)(Math.random() * (NOTE_MAX - NOTE_MIN + 1)) + NOTE_MIN;
            
        }
      
        int totalNote = 0;
        for (int j = 0; j < notesObtenues.length; j++) {
            totalNote += notesObtenues[j];
            System.out.println("La note obtenue est " + notesObtenues[j]);
        switch (notesObtenues[j]) {

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
            System.out.println("insuffisant");
                break;
        }
        
    }
    float moyenne = (float) totalNote / notesObtenues.length;
   if (moyenne > 4) {
    System.out.println("L'élève est promu !");
    
   }
   else {
    System.out.println("L'élève est non promu !");
   }
        
    }
    
}
