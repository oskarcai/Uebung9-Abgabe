package p1;

// Import der Random-Klasse:
import java.util.Random;

public class P1_main {

    private static final Random random = new Random();  // auch möglich, statt in jeder Methode neues Random-Objekt zu erzeugen

    // Main-Methode:
    public static void main(String[] args) {

    }

    // Methoden:
    public static int[] randomArray(int x) {
        Random random = new Random();

        int[] randomArray = new int[x];
        for(int i = 0; i < x; i++) {    // x == randomArray.length
            randomArray[i] = random.nextInt();  // .nextInt()
                                                // -> zufällige Zahl aus dem gesamten Integer-Wertebereich
        }
        return randomArray;
    }

    public static int[] randomArray2(int x) {
        Random random = new Random();

        int[] randomArray2 = new int[x];
        for(int i = 0; i < x; i++) {
            randomArray2[i] = random.nextInt(x);    // .nextInt(bound)
                                                    // -> zufällige Zahl zwischen 0 (inkl.) und bound (exkl.)
        }
        return randomArray2;
    }

    public static int[] randomArray3() {
        Random random = new Random();

        int[] randomArray3 = new int[6];
        for(int i = 0; i < 6; i++) {
            randomArray3[i] = random.nextInt(55,76);   // .nextInt(origin, bound)
                                                                    // -> zufällige Zahl zwischen origin (inkl.) und bound (exkl.)
        }
        return randomArray3;
    }

    public static int[] randomArray4(int n) {
        Random random = new Random();

        int[] randomArray4 = new int[n+1];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            randomArray4[i] = random.nextInt(50)+1;  // .nextInt(bound)+1
                                                            // -> Wertebereich um +1 verschoben
            sum += randomArray4[i];
        }
        randomArray4[n] = sum / n;
        return randomArray4;
    }

}
