import java.util.Random;
import java.util.stream.IntStream;

public class CounterStrike2 {
    public static void main(String[] args) {
        counterStrike();
    }
    public static void counterStrike(){
        Random random = new Random();
        int [] team1 = new int[5];
        int [] team2 = new int[5];

        for (int i = 0;i < team1.length;i++) {
            team1[i] = random.nextInt(11);
        }

        for (int j = 0; j < team2.length; j++) {
            team2[j] = random.nextInt(11);
        }

        int sum1 = IntStream.of(team1).sum();
        int sum2 = IntStream.of(team2).sum();

        if (sum1 > sum2) {
            System.out.println("Перемогла команда " + "team1 " + "набрала " + sum1 + " очков");
        } else if (sum1 < sum2) {
            System.out.println("Перемогла команда " + "team2 " + "набрала " + sum2 + " очков");
        }
    }
}
