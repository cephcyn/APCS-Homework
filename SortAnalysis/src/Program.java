
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        int[] list;

        //set one (random init, varying length)
        for (int i = 1; i <= 4096; i *= 2) {
            list = new int[i];
            randomInit(list);
        }

        //set two (custom init, fixed length)
    }

    private static void randomInit(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt();
        }
    }
    
    private static void reverseInit(int[] a) {
        
    }
    
    private static void orderInit(int[] a) {
        
    }
    
    private static String formatArray(int[] a) {
        String out = "[" + a[0];
        for(int i = 1; i < a.length; i++) {
            out += ", " + a[i];
        }
        out += "]";
        return out;
    }
}
