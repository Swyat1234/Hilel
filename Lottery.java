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
            Arrays.sort(first);
            for (int j = 0; j < second.length; j++) {
                second[j] = random.nextInt(10);
                Arrays.sort(second);
            }
        }
        if (first[0] == second[0] || first[1] == second[1] || first[2] == second[2] || first[3] == second[3] || first[4] == second[4] || first[5] == second[5] || first[6] == second[6]) {
            match++;
        }
        System.out.println("Match " + match + " times");
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
    }
}

