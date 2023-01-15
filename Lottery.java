import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] first = new int[7];
        int[] second = new int[7];
        int match = 0;
        Random random = new Random();


        for (int i = 0; i < first.length; i++) {
            first[i] = random.nextInt(10);

            for (int j = 0; j < second.length; j++) {
                second[j] = random.nextInt(10);
                if (first[i] == second[j]) {
                    match++;
                }
            }
        }

        System.out.println("Match " + match + " times");
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
    }
}

