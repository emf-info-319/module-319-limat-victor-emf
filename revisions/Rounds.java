/**
 * Rounds
 */
public class Rounds {

    final static double PI = 3.145;

    public static void main(String[] args) {
        int min = 13;
        int max = 23;
        int[] rayons = new int[10];
        for (int i = 0; i < rayons.length; i++) {
            rayons [i] = genereNombre(min, max);
        }
        for (int i = rayons.length - 1; i >= 0; i--) {
            
        }
        for (int i = 0; i < rayons.length; i++) {
            if(rayons[i] > 50) {
                System.out.println(PI * rayons[i]*rayons[i]); }

                else {
                    System.out.println(PI * 2 * rayons[i]);
                }
            
        }
    
    }

    public static int genereNombre(int min, int max){           
        int nombre = (int) (Math.random()*(max - min + 1)) + min;
        return nombre;
}

}