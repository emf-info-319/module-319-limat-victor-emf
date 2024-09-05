package exercices.exercice04;

public class EchangeDeValeurs {
    /**
     * InnerEchangeDeValeurs
     */
    public class InnerEchangeDeValeurs {
        public static void main(String[] args) {
            int variable1 = 1;
            int variable2 = 2;
            
            int variable3 = variable1;
            variable1 = variable2;
            variable2 = variable3;

            System.out.println(variable1);
            System.out.println(variable2);
         
        }

    }

}
